package jaxb.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import com.yunyitg.cesp.core.imports.order.xml.obj.InternationalTrade;

public class JaxbTest {

	/**
	 * object 转化为xml字符串
	 * @param clazz
	 * @return
	 * @throws JAXBException
	 */
	public static <T> String createDiffgramXml(T clazz) throws JAXBException {
		
		
		JAXBContext context = JAXBContext.newInstance(clazz.getClass());    // 获取上下文对象  
        Marshaller marshaller = context.createMarshaller(); // 根据上下文获取marshaller对象  
         
//        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);  //去掉xml头部
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);  //格式化xml
        
//        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new MyNamespacePrefixMapper());
        
        StringWriter writer = new StringWriter(); 
        marshaller.marshal(clazz, writer);  
        return writer.toString();
	}
	
	public static <T> byte[] createDiffgramXml1(T clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz.getClass());    // 获取上下文对象  
        Marshaller marshaller = context.createMarshaller(); // 根据上下文获取marshaller对象  
         
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);  //去掉xml头部
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(clazz, baos);
        return baos.toByteArray();
	}
  	
	/**
	 * 自定义命名空间
	 * @author yangyuantao
	 *
	 */
	private static class MyNamespacePrefixMapper extends NamespacePrefixMapper {
		@Override
		public String getPreferredPrefix(String namespaceUri,
				String suggestion, boolean requirePrefix) {
			System.out.println("namespaceUri:" + namespaceUri);
			System.out.println("suggestion:" + suggestion);
			System.out.println("requirePrefix:" + requirePrefix);
//			
			if (requirePrefix) {
				if("http://www.chinaport.gov.cn/ceb".equals(namespaceUri)) {
					return "ceb";
				}
//				if ("urn:schemas-microsoft-com:xml-diffgram-v1".equals(namespaceUri)) {
//					return "diffgr";
//				} else if("urn:schemas-microsoft-com:xml-msdata".equals(namespaceUri)) {
//					return "msdata";
//				}
				
				return suggestion;
			} else {
				return "";
			}
		}
	}
	
	/**
	 * xml字符串转换为object
	 * @param xmlString
	 * @param clazz
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T parseXmlString(String xmlString, T clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz.getClass());  
		Unmarshaller unmarshaller = context.createUnmarshaller(); 
		T object = (T)unmarshaller.unmarshal(new StringReader(xmlString));

		return object;
	}
	
	/**
	 * xml文件转换为object
	 * @param file
	 * @param clazz
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T parseXmlFile(File file, T clazz) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(clazz.getClass());  
		Unmarshaller unmarshaller = context.createUnmarshaller(); 
		T object = (T)unmarshaller.unmarshal(file);

		return object;
	}
	
	public static void main(String[] args) throws JAXBException {
//		Diffgram diffgram = parseXmlFile(new File("C:/Users/Administrator/Desktop/南沙保税港区企业申报资料/测试请求数据样例/diffgram.xml"), new Diffgram());
//		System.out.println(diffgram.getNewDataSet().getLdcHead().get(0).toString());
	
//		Diffgram diffgram1 = parseXmlFile(new File("C:/Users/Administrator/Desktop/南沙保税港区企业申报资料/测试请求数据样例/data3.xml"), new Diffgram());
//		System.out.println(diffgram1.getNewDataSet().getLdcList().size());
		
//		Diffgram diffgram2 = parseXmlFile(new File("C:/Users/Administrator/Desktop/南沙保税港区企业申报资料/测试请求数据样例/diffgram_ldc_head_ldc_list.xml"), new Diffgram());
//		System.out.println(diffgram2.getNewDataSet().getLdcHead().get(0).toString());
//		System.out.println(diffgram2.getNewDataSet().getLdcList().get(0).toString());
//		
//		System.out.println(createDiffgramXml(diffgram2));
		
//		CEB816Message msg = parseXmlFile(new File("C:/Users/Administrator/Desktop/CEB816Message_KJGGPT2017070714233443981.xml"), new CEB816Message());
//		System.out.println(msg.toString());
//		System.out.println(msg.getTax() == null);
		
		InternationalTrade t = new InternationalTrade();
		InternationalTrade.Head head = new InternationalTrade.Head();
		InternationalTrade.Declaration.OrderHead orderhead = new InternationalTrade.Declaration.OrderHead();
		orderhead.setEBEntName("电商企业名称");
		InternationalTrade.Declaration d = new InternationalTrade.Declaration();
		d.setOrderHead(orderhead);
		t.setHead(head);
		t.setDeclaration(d);
		System.out.println(createDiffgramXml(t));
	}
}
