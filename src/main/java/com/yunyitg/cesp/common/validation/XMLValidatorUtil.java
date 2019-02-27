package com.yunyitg.cesp.common.validation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidatorUtil {
	
	static String KJ881101_商品备案 = "G:/WorkPlace/Java_EEWorkplace/cbec-web/src/main/resources/xsd" + File.separator + "KJ881101_商品备案.xsd";
	static String KJ881110_电子清单 = "G:/WorkPlace/Java_EEWorkplace/cbec-web/src/main/resources/xsd" + File.separator + "KJ881110_电子清单.xsd";
	static String KJ881111_电子订单 = "G:/WorkPlace/Java_EEWorkplace/cbec-web/src/main/resources/xsd" + File.separator + "KJ881111_电子订单.xsd";
	static String KJ881113_电子运单 = "G:/WorkPlace/Java_EEWorkplace/cbec-web/src/main/resources/xsd" + File.separator + "KJ881113_电子运单.xsd";

	
	public static ValidateResult validateXML(String xsdPath, InputStream stream) {
		
		ValidateResult result = new ValidateResult();
		try {
			
			SchemaFactory factory = 
					SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(stream));
		} catch(IOException | SAXException e) {
			result.setMessage(e.getMessage());
		}
		return result;
		
	}
	
	public static ValidateResult validateXMLSchema(String xsdPath, String xmlPath) {

		ValidateResult result = new ValidateResult();
		try {

			SchemaFactory factory = 
					SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch(IOException | SAXException e) {
			result.setMessage(e.getMessage());
		}
		return result;

	}
	
	public static void main(String[] args) {
		
		
		ValidateResult result = validateXMLSchema(KJ881110_电子清单, "C:/Users/Administrator/Desktop/KJ881110_FSZHHY_2017042812250000169.xml");
		System.out.println(result.isValid());
		System.out.println(result.getMessage());
	}
}
