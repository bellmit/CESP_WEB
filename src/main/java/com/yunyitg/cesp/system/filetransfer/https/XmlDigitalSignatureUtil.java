package com.yunyitg.cesp.system.filetransfer.https;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.security.x509.X509CertImpl;

public class XmlDigitalSignatureUtil {
	protected static Log logger = LogFactory
			.getLog(XmlDigitalSignatureUtil.class);

	public static void generateXMLDigitalSignature(String originalXmlFilePath,
			String destnSignedXmlFilePath, String privateKeyFilePath,
			String publicKeyFilePath) throws Exception {
		logger.debug("使用公钥【" + publicKeyFilePath + "】私钥【" + privateKeyFilePath
				+ "】签名【" + originalXmlFilePath + "】结果【"
				+ destnSignedXmlFilePath + "】...");
		Document doc = getDocument(originalXmlFilePath);
		XMLSignatureFactory xmlSigFactory = XMLSignatureFactory
				.getInstance("DOM");
		PrivateKey privateKey = CryptographicUtil
				.getStoredPrivateKey(privateKeyFilePath);
		DOMSignContext domSignCtx = new DOMSignContext(privateKey,
				doc.getDocumentElement());
		Reference ref = xmlSigFactory
				.newReference(
						"",
						xmlSigFactory.newDigestMethod(
								"http://www.w3.org/2000/09/xmldsig#sha1",
								(DigestMethodParameterSpec) null),
						Collections.singletonList(xmlSigFactory
								.newTransform(
										"http://www.w3.org/2000/09/xmldsig#enveloped-signature",
										(TransformParameterSpec) null)),
						(String) null, (String) null);
		SignedInfo signedInfo = xmlSigFactory.newSignedInfo(xmlSigFactory
				.newCanonicalizationMethod(
						"http://www.w3.org/TR/2001/REC-xml-c14n-20010315",
						(C14NMethodParameterSpec) null), xmlSigFactory
				.newSignatureMethod(
						"http://www.w3.org/2000/09/xmldsig#rsa-sha1",
						(SignatureMethodParameterSpec) null), Collections
				.singletonList(ref));
		KeyInfo keyInfo = getKeyInfo(xmlSigFactory, publicKeyFilePath);
		XMLSignature xmlSignature = xmlSigFactory.newXMLSignature(signedInfo,
				keyInfo);
		xmlSignature.sign(domSignCtx);
		storeDocument(doc, destnSignedXmlFilePath);
		logger.debug("使用公钥【" + publicKeyFilePath + "】私钥【" + privateKeyFilePath
				+ "】签名【" + originalXmlFilePath + "】结果【"
				+ destnSignedXmlFilePath + "】成功!");
	}

	public static String generateXMLDigitalSignature(String originalXml,
			String privateKeyFilePath, String publicKeyFilePath)
			throws Exception {
		logger.debug("使用公钥【" + publicKeyFilePath + "】私钥【" + privateKeyFilePath
				+ "】签名...");
		Document doc = getDocument((InputStream) (new ByteArrayInputStream(
				originalXml.getBytes("UTF-8"))));
		XMLSignatureFactory xmlSigFactory = XMLSignatureFactory
				.getInstance("DOM");
		PrivateKey privateKey = CryptographicUtil
				.getStoredPrivateKey(privateKeyFilePath);
		DOMSignContext domSignCtx = new DOMSignContext(privateKey,
				doc.getDocumentElement());
		Reference ref = xmlSigFactory
				.newReference(
						"",
						xmlSigFactory.newDigestMethod(
								"http://www.w3.org/2000/09/xmldsig#sha1",
								(DigestMethodParameterSpec) null),
						Collections.singletonList(xmlSigFactory
								.newTransform(
										"http://www.w3.org/2000/09/xmldsig#enveloped-signature",
										(TransformParameterSpec) null)),
						(String) null, (String) null);
		SignedInfo signedInfo = xmlSigFactory.newSignedInfo(xmlSigFactory
				.newCanonicalizationMethod(
						"http://www.w3.org/TR/2001/REC-xml-c14n-20010315",
						(C14NMethodParameterSpec) null), xmlSigFactory
				.newSignatureMethod(
						"http://www.w3.org/2000/09/xmldsig#rsa-sha1",
						(SignatureMethodParameterSpec) null), Collections
				.singletonList(ref));
		KeyInfo keyInfo = getKeyInfo(xmlSigFactory, publicKeyFilePath);
		XMLSignature xmlSignature = xmlSigFactory.newXMLSignature(signedInfo,
				keyInfo);
		xmlSignature.sign(domSignCtx);
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer trans = transFactory.newTransformer();
		StringWriter writer = new StringWriter();
		StreamResult streamRes = new StreamResult(writer);
		trans.transform(new DOMSource(doc), streamRes);
		logger.debug("使用公钥【" + publicKeyFilePath + "】私钥【" + privateKeyFilePath
				+ "】签名成功!");
		return writer.toString();
	}

	public static boolean isXmlDigitalSignature(String xmlFilePath)
			throws Exception {
		Document doc = getDocument(xmlFilePath);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			logger.debug("【" + xmlFilePath + "】未找到签名元素【Signature】...");
			return false;
		} else {
			logger.debug("【" + xmlFilePath + "】签名【" + nl.item(0) + "】...");
			return true;
		}
	}

	public static boolean isXmlDigitalSignature(InputStream xmlInputStream)
			throws Exception {
		Document doc = getDocument(xmlInputStream);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			logger.debug("未找到签名元素【Signature】...");
			return false;
		} else {
			logger.debug("签名【" + nl.item(0) + "】...");
			return true;
		}
	}

	public static boolean isXmlDigitalSignatureValid(String signedXmlFilePath)
			throws Exception {
		logger.debug("验证签名【" + signedXmlFilePath + "】...");
		boolean validFlag = false;
		Document doc = getDocument(signedXmlFilePath);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			throw new Exception("【" + signedXmlFilePath
					+ "】未找到签名元素【Signature】...");
		} else {
			logger.debug("【" + signedXmlFilePath + "】签名【" + nl.item(0) + "】...");
			Node signatureNode = nl.item(0);
			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			XMLSignature signature = fac
					.unmarshalXMLSignature(new DOMStructure(signatureNode));
			KeyValue keyValue = (KeyValue) signature.getKeyInfo().getContent()
					.get(0);
			PublicKey publicKey = keyValue.getPublicKey();
			DOMValidateContext valContext = new DOMValidateContext(publicKey,
					nl.item(0));
			validFlag = signature.validate(valContext);
			if (validFlag) {
				logger.debug("验证签名【" + signedXmlFilePath + "】成功!");
			} else {
				logger.debug("验证签名【" + signedXmlFilePath + "】失败!");
			}

			return validFlag;
		}
	}

	public static boolean isXmlDigitalSignatureValid(InputStream xmlInputStream)
			throws Exception {
		logger.debug("验证签名...");
		boolean validFlag = false;
		Document doc = getDocument(xmlInputStream);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			throw new Exception("未找到签名元素【Signature】...");
		} else {
			logger.debug("签名【" + nl.item(0) + "】...");
			Node signatureNode = nl.item(0);
			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			XMLSignature signature = fac
					.unmarshalXMLSignature(new DOMStructure(signatureNode));
			KeyValue keyValue = (KeyValue) signature.getKeyInfo().getContent()
					.get(0);
			PublicKey publicKey = keyValue.getPublicKey();
			DOMValidateContext valContext = new DOMValidateContext(publicKey,
					nl.item(0));
			validFlag = signature.validate(valContext);
			if (validFlag) {
				logger.debug("验证签名成功!");
			} else {
				logger.debug("验证签名失败!");
			}

			return validFlag;
		}
	}

	public static boolean isXmlDigitalSignatureValid(String signedXmlFilePath,
			String pubicKeyFilePath) throws Exception {
		logger.debug("使用公钥【" + pubicKeyFilePath + "】验证签名【" + signedXmlFilePath
				+ "】...");
		boolean validFlag = false;
		Document doc = getDocument(signedXmlFilePath);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			throw new Exception("【" + signedXmlFilePath
					+ "】未找到签名元素【Signature】...");
		} else {
			logger.debug("【" + signedXmlFilePath + "】签名【" + nl.item(0) + "】...");
			PublicKey publicKey = CryptographicUtil
					.getStoredPublicKey(pubicKeyFilePath);
			DOMValidateContext valContext = new DOMValidateContext(publicKey,
					nl.item(0));
			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			XMLSignature signature = fac.unmarshalXMLSignature(valContext);
			validFlag = signature.validate(valContext);
			if (validFlag) {
				logger.debug("使用公钥【" + pubicKeyFilePath + "】验证签名【"
						+ signedXmlFilePath + "】成功!");
			} else {
				logger.debug("使用公钥【" + pubicKeyFilePath + "】验证签名【"
						+ signedXmlFilePath + "】失败!");
			}

			return validFlag;
		}
	}

	@Deprecated
	public static boolean validate(InputStream xmlInputStream) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		Document doc = dbf.newDocumentBuilder().parse(xmlInputStream);
		NodeList nl = doc.getElementsByTagNameNS(
				"http://www.w3.org/2000/09/xmldsig#", "Signature");
		if (nl.getLength() == 0) {
			throw new Exception("Cannot find Signature element");
		} else {
			Node signatureNode = nl.item(0);
			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			XMLSignature signature = fac
					.unmarshalXMLSignature(new DOMStructure(signatureNode));
			if (signature.getKeyInfo().getContent().size() >= 2
					&& signature.getKeyInfo().getContent().get(1) instanceof X509Data) {
				X509Data data = (X509Data) signature.getKeyInfo().getContent()
						.get(1);
				List l = data.getContent();
				X509CertImpl cert = (X509CertImpl) l.get(0);
				PublicKey pubKey = cert.getPublicKey();
				DOMValidateContext valCtx = new DOMValidateContext(pubKey,
						signatureNode);
				boolean coreValidity = signature.validate(valCtx);
				if (coreValidity) {
					logger.debug("Signature passed core validation");
					return true;
				} else {
					logger.debug("Core validation failed");
					boolean sv = signature.getSignatureValue().validate(valCtx);
					logger.debug("Signature validation status: " + sv);
					List refs = signature.getSignedInfo().getReferences();

					for (int i = 0; i < refs.size(); ++i) {
						Reference ref = (Reference) refs.get(i);
						boolean refValid = ref.validate(valCtx);
						logger.debug("Reference[" + i + "] validity status: "
								+ refValid);
					}

					return false;
				}
			} else {
				throw new Exception("报文签名格式不是总署签名格式【X509Data签名】，不能通过验签...");
			}
		}
	}

	private static KeyInfo getKeyInfo(XMLSignatureFactory xmlSigFactory,
			String publicKeyPath) throws Exception {
		PublicKey publicKey = CryptographicUtil
				.getStoredPublicKey(publicKeyPath);
		KeyInfoFactory keyInfoFact = xmlSigFactory.getKeyInfoFactory();
		KeyValue keyValue = keyInfoFact.newKeyValue(publicKey);
		KeyInfo keyInfo = keyInfoFact.newKeyInfo(Collections
				.singletonList(keyValue));
		return keyInfo;
	}

	public static void storeDocument(Document doc, String xmlFilePath)
			throws Exception {
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer trans = transFactory.newTransformer();
		StreamResult streamRes = new StreamResult(new File(xmlFilePath));
		trans.transform(new DOMSource(doc), streamRes);
		logger.debug("存储【" + xmlFilePath + "】...");
	}

	public static Document getDocument(String xmlFilePath) throws Exception {
		logger.debug("获取【" + xmlFilePath + "】...");
		return getDocument((InputStream) (new FileInputStream(xmlFilePath)));
	}

	private static Document getDocument(InputStream xmlInputStream)
			throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		Document doc = dbf.newDocumentBuilder().parse(xmlInputStream);
		return doc;
	}
}