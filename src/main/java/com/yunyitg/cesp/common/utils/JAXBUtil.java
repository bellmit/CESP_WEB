package com.yunyitg.cesp.common.utils;

import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class JAXBUtil {

	
	public static <T> String createXml(T clazz) throws JAXBException {


		JAXBContext context = JAXBContext.newInstance(clazz.getClass());    // 获取上下文对象  
		Marshaller marshaller = context.createMarshaller(); // 根据上下文获取marshaller对象  

		//marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);  //去掉xml头部
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);  //格式化xml
//		marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new MyNamespacePrefixMapper());
		marshaller.setListener(new MarshallerListener());
		StringWriter writer = new StringWriter(); 
		marshaller.marshal(clazz, writer);  
		return writer.toString();
	}
	
	/**
	 * 自定义命名空间
	 * @author yangyuantao
	 *
	 */
	private static class MyNamespacePrefixMapper extends NamespacePrefixMapper {

		@Override
		public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

			System.out.println("namespaceUri:" + namespaceUri);
			System.out.println("suggestion:" + suggestion);
			System.out.println("requirePrefix:" + requirePrefix);
			if ("http://www.chinaport.gov.cn/ceb".equals(namespaceUri)) {
				return "ceb";
			} else if ("http://www.w3.org/2001/XMLSchema-instance".equals(namespaceUri)) {
				return "xsi";
			} else if ("http://www.w3.org/2000/09/xmldsig#".equals(namespaceUri)) {
				return "ds";
			}
			return suggestion;
		}
	}
	
	public static void main(String[] args) throws JAXBException {

		InternationalTradeOrder inter = new InternationalTradeOrder();
		Head head = new Head();
		OrderDeclaration declaration = new OrderDeclaration();
		head.setMessageID("KJ881012_fazhhy_201711280034");
		head.setMessageType("KJ881012");
		head.setSender("fazhhy");
		head.setReceiver("KJPUBLIC");
		head.setFunctionCode("BOTH");

		OrderDeclaration.OrderHead orderHead = new OrderDeclaration.OrderHead();
		orderHead.setCustomsCode("5141");
		declaration.setOrderHead(orderHead);

		inter.setDeclaration(declaration);
		inter.setHead(head);

		
		System.out.println(createXml(inter));
	}
	
	public static class  MarshallerListener extends Marshaller.Listener {  

		public static final String BLANK_CHAR = "";  

		/**
		 * 因为做了字符串的处理，所以null的注释失效了。这里通过字段名来过滤null
		 */
		private static String[] nullString = {"billType",
				"editType","invNo","invPwd","lclFlag","prodQgp","vNList"};

		@Override  
		public void beforeMarshal(Object source) {  
			super.beforeMarshal(source);  
			Field[] fields = source.getClass().getDeclaredFields();  
			for (Field f : fields) {  
				f.setAccessible(true);  

				//获取字段上注解<pre name="code" class="java">            
				try {  
					if (f.getType() == String.class && f.get(source) == null) {
						f.set(source, BLANK_CHAR);  
					}/*else if(f.getType() == String.class && f.get(source) != null){
	                    	String value = (String) f.get(source);
	                    	value = value.replace("&", "&amp;");
	                    	value = value.replace("'", "&apos;");
	                    	value = value.replace("\"", "&quot;");
	                    	value = value.replace(">", "&gt;");
	                    	value = value.replace("<", "&lt;");
	                    	f.set(source,value);
	                    }*/
				} catch (IllegalAccessException e) {  
					e.printStackTrace();  
				}  
			}  
		}  

		/**
		 * 是否允许为空
		 * @return
		 */
		private static boolean ifGNull(String name){
			//	    	if(name.contains("billType")){
			//	    		System.out.println(name);
			//	    	}
			for(String ns:nullString){
				if(name.contains(ns)){
					return true;
				}
			}
			return false;
		}

		public static void main(String[] args) {
			String value = "&kkdkd'sssss\"ssss<ssss>";
			value = value.replace("&", "&amp;");
			value = value.replace("'", "&apos;");
			value = value.replace("\"", "&quot;");
			value = value.replace(">", "&gt;");
			value = value.replace("<", "&lt;");
			System.out.println(value);
		}
	}  
}
