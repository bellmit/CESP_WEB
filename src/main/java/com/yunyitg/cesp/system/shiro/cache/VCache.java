package com.yunyitg.cesp.system.shiro.cache;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.apache.shiro.io.ResourceUtils;

import com.yunyitg.cesp.common.statics.Constant;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.common.utils.StringUtils;

/**
 * 
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * <p>
 * 
 * 简单封装的Cache
 * 
 * <p>
 * 
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年6月2日 　<br/>
 *
 * @author zhou-baicheng
 * @email  so@sojson.com
 * @version 1.0,2016年6月2日 <br/>
 * 
 */
@SuppressWarnings("unchecked")
public final class VCache {
	static Cache CACHE = null;
	static{
		InputStream input = null;
		try {
			//这里是加载 官方jar包自带的配置文件。
			//private String cacheManagerConfigFile = "classpath:org/apache/shiro/cache/ehcache/ehcache.xml";
			input = ResourceUtils.getInputStreamForPath("classpath:ehcache-config.xml");
		} catch (IOException e) {
			LoggerUtils.error(VCache.class, "加载自带配置文件ehcache.xml出错，停止项目...", e);
			System.exit(0);
		}
        CacheManager manager = new CacheManager(input);
        /** 开始想着重新赋值一个cache
		CacheConfiguration cfg = CacheManager.create(input).getConfiguration().getDefaultCacheConfiguration()
				.maxEntriesLocalHeap(10000)
				.overflowToDisk(Boolean.TRUE)
                .eternal(Boolean.TRUE)
                .timeToLiveSeconds(1000).diskPersistent(true)
                .timeToIdleSeconds(1000).name("vcache");
         */
        CACHE = manager.getCache("vcache-data");
	}
	
	private VCache() {}
	
	/**
	 * 简单的Get
	 * @param <T>
	 * @param key
	 * @param requiredType
	 * @return
	 */
	@SafeVarargs
	public static <T> T get(String key , Class<T>...requiredType){
		Element element = CACHE.get(key);
		if(StringUtils.isNotBlank(element)){
			return (T)element.getObjectValue();
		}
		return null;
	}
	/**
	 * 简单的set
	 * @param key
	 * @param value
	 */
	public static void set(Object key ,Object value){
		CACHE.put(new Element(key, value));
	}
	/**
	 * 过期时间的
	 * @param key
	 * @param value
	 * @param timer （秒）
	 */
	public static void setTTL(Object key, Object value, int timer) {
		Element element = new Element(key, value);
		element.setTimeToIdle(0);
		element.setTimeToLive(timer);
		CACHE.put(element);
	}
	/**
	 * 
	 * @param <T>
	 * @param mapkey map
	 * @param key	 map里的key
	 * @param requiredType value的泛型类型
	 * @return
	 */
	public static <T> T getVByMap(String mapkey,String key , Class<T> requiredType){
		Element element = CACHE.get(mapkey);
		
		if(StringUtils.isNotBlank(element)){
			Map<String,T> map = (Map<String, T>) element.getObjectValue();
			return map.get(key);
		}
		return null;
	}
	/**
	 * 
	 * @param mapkey map
	 * @param key	 map里的key
	 * @param value   map里的value
	 */
	public static void setVByMap(String mapkey,String key ,Object value){
		Element element = CACHE.get(mapkey);
		Map<String,Object> map = null;
		if(null == element){
			map = new LinkedHashMap<String,Object>();
			map.put(key, value);
		}else{
			map = (Map<String,Object>)element.getObjectValue();
			map.put(key, value);
		}
		element = new Element(mapkey, map);
		CACHE.put(element);
	}
	/**
	 * 删除Map里的值
	 * @param mapKey
	 * @param dkey
	 * @return
	 */
	public static int delByMapKey(String mapKey ,String...dkey){
		Element element = CACHE.get(mapKey);
		int result = 0;
		if(null == element || null == dkey || dkey.length == 0){
			return result;
		}else{
			Map<String,Object>map = (Map<String,Object>)element.getObjectValue();
			for (String key : dkey) {
				map.remove(key);
				result++;
			}
		}
		return result;
	}
	
	/**
	 * 往cache里取set整个集合
	 * 
	 * @param <T>
	 * @param setKey
	 * @param start
	 * @param end
	 * @param requiredType
	 * @return
	 */
	public static <T> Set<T> getVByList(String setKey,Class<T> requiredType){
		Element element = CACHE.get(setKey);
		if(StringUtils.isNotBlank(element)){
			Set<T> set = (Set<T>) element.getObjectValue();
			return set;
		}
		return null;
	}
	/**
	 * 获取Set长度
	 * @param setKey
	 * @return
	 */
	public static Integer getLenBySet(String setKey){
		Element element = CACHE.get(setKey);
		if(StringUtils.isNotBlank(element)){
			Set<Object> set = (Set<Object>) element.getObjectValue();
			if(null != set){
				return set.size();
			}
		}
		return Constant.I_ZERO;
	}
	/**
	 * 删除Set
	 * @param params
	 * @return
	 */
	public static Long delSetByElements(String key,Object...params){
		Element element = CACHE.get(key);
		int i = 0;
		if(StringUtils.isNotBlank(element)){
			Set<Object> set = (Set<Object>) element.getObjectValue();
			if(null != set){
				for (Object obj : set) {
					if(set.contains(obj)){
						set.remove(obj);
						i++;
					}
				}
			}
		}
		return new Long(i);
	}
	/**
	 * 往cache里存Set
	 * @param setKey
	 * @param value
	 */
	public static void setVBySet(String setKey,Object value){
		Element element = CACHE.get(setKey);
		Set<Object> set = null;
		if(null == element){
			set = new LinkedHashSet<Object>();
			set.add(value);
		}else{
			set = (Set<Object>)element.getObjectValue();
			set.add(value);
		}
		element = new Element(setKey, set);
		CACHE.put(element);
	}
	/**
	 * 取set 
	 * @param key
	 * @return
	 */
	public static Set<Object> getSetByKey(String key){
		Element element = CACHE.get(key);
		if(StringUtils.isNotBlank(element)){
			return  (Set<Object>) element.getObjectValue();
		}
        return null;
		 
	}
	
	
	/**
	 * 往cache里存List
	 * @param listKey
	 * @param value
	 */
	public static void setVByList(String listKey,Object value){
		Element element = CACHE.get(listKey);
		List<Object> list = null;
		if(null == element){
			list = new LinkedList<Object>();
			list.add(value);
		}else{
			list = (List<Object>)element.getObjectValue();
			list.add(value);
		}
		element = new Element(listKey, list);
		CACHE.put(element);
	}
	/**
	 * 往cache里取list
	 * 
	 * @param <T>
	 * @param listKey
	 * @param start
	 * @param end
	 * @param requiredType
	 * @return
	 */
	public static <T> List<T> getVByList(String listKey,int start,int end,Class<T> requiredType){
		Element element = CACHE.get(listKey);
		List<T> list = null;
		if(null == element){
			return list;
		}else{
			list = (List<T>)element.getObjectValue();
			if(list.size() > start && list.size() > end){
				return list.subList(start, end);
			}
		}
		return null;
	}
	/**
	 * 获取list长度
	 * @param listKey
	 * @return
	 */
	public static Long getLenByList(String listKey){
		Element element = CACHE.get(listKey);
		List<Object> list = null;
		if(null != element){
			list = (List<Object>)element.getObjectValue();
			if(null != list){
				return new Long(list.size());
			}
		}
		return Constant.ZERO;
	}
	/**
	 * 删除
	 * @param dkey
	 * @return
	 */
	public static Long delByKey(String...dkey){
		if(null != dkey && dkey.length > 0){
			int i =0;
			for (String key : dkey) {
				if(CACHE.remove(key)){
					i++;
				}
			}
			return new Long(i);
		}
		return Constant.ZERO;
	}
	/**
	 * 判断是否存在
	 * @param key
	 * @return
	 */
	public static boolean exists(String key){
		return null != CACHE.get(key);
	}
	/**
	 * 有序关闭Starts an orderly shutdown of the Cache. 
	 */
	public static void returnResource() {
		CACHE.dispose();
	 }
}
