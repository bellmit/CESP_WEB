package com.yunyitg.cesp.common.restructure;

import static org.springframework.util.StringUtils.tokenizeToStringArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;

import com.yunyitg.cesp.common.utils.LoggerUtils;


public class PackagesSqlSessionFactoryBean extends SqlSessionFactoryBean {    
    
    static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";    
    
//    private static Logger logger = LogUtil.get();    
    
    @Override    
    public void setTypeAliasesPackage(String typeAliasesPackage) {    
        ResourcePatternResolver resolver = (ResourcePatternResolver) new PathMatchingResourcePatternResolver();    
        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory(resolver);
        if (org.springframework.util.StringUtils.hasLength(typeAliasesPackage)) {
        	String[] typeAliasPackageArray = tokenizeToStringArray(typeAliasesPackage,
        			ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS);
        	List<String> result = new ArrayList<String>();    
        	for (String packageToScan : typeAliasPackageArray) {
        		packageToScan = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +    
        				ClassUtils.convertClassNameToResourcePath(packageToScan) + "/" + DEFAULT_RESOURCE_PATTERN;  
        		//将加载多个绝对匹配的所有Resource    
        		//将首先通过ClassLoader.getResource("META-INF")加载非模式路径部分    
        		//然后进行遍历模式匹配    
        		try {    
        			Resource[] resources =  resolver.getResources(packageToScan);
        			if(resources != null && resources.length > 0){    
        				MetadataReader metadataReader = null;    
        				for(Resource resource : resources){ 
//        					System.out.println("resource: " + resource.getDescription());
        					if(resource.isReadable()){    
        						metadataReader =  metadataReaderFactory.getMetadataReader(resource);    
        						try {    
        							result.add(Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName());    
        						} catch (ClassNotFoundException e) {    
        							e.printStackTrace();    
        						}    
        					}    
        				}    
        			}    
        		} catch (IOException e) {    
        			e.printStackTrace();    
        		}    
        	} 
        	if(result.size() > 0) {    
				super.setTypeAliasesPackage(StringUtils.join(result.toArray(), ","));
				System.out.println("package: " + StringUtils.join(result.toArray(), ","));
			}else{    
				LoggerUtils.error(this.getClass(), "参数typeAliasesPackage:"+typeAliasesPackage+"，未找到任何包");    
			}    
        } else {
        	LoggerUtils.error(this.getClass(), "参数typeAliasesPackage:"+typeAliasesPackage+"，未找到任何包");
        }

        
        /*typeAliasesPackage = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +    
                ClassUtils.convertClassNameToResourcePath(typeAliasesPackage) + "/" + DEFAULT_RESOURCE_PATTERN;    
    
        //将加载多个绝对匹配的所有Resource    
        //将首先通过ClassLoader.getResource("META-INF")加载非模式路径部分    
        //然后进行遍历模式匹配    
        try {    
            List<String> result = new ArrayList<String>();    
            Resource[] resources =  resolver.getResources(typeAliasesPackage);
            if(resources != null && resources.length > 0){    
                MetadataReader metadataReader = null;    
                for(Resource resource : resources){ 
                    if(resource.isReadable()){    
                       metadataReader =  metadataReaderFactory.getMetadataReader(resource);    
                        try {    
                            result.add(Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName());    
                        } catch (ClassNotFoundException e) {    
                            e.printStackTrace();    
                        }    
                    }    
                }    
            }    
            if(result.size() > 0) {    
                super.setTypeAliasesPackage(StringUtils.join(result.toArray(), ","));    
            }else{    
                LoggerUtils.error(this.getClass(), "参数typeAliasesPackage:"+typeAliasesPackage+"，未找到任何包");    
            }    
            //logger.info("d");    
        } catch (IOException e) {    
            e.printStackTrace();    
        }    */
    }    
    
}    
