package com.yunyitg.cesp.system.filetransfer.https;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CryptographicUtil {
	private static Log logger = LogFactory.getLog(CryptographicUtil.class);
	private static final String ALGORITHM = "RSA";
	private static final int KEYSIZE = 1024;
	public static final String PUBLICKEY = "publickey.key";
	public static final String PRIVATEKEY = "privatekey.key";

	public static void storeKeyPairs(String dirPath) throws Exception {
		KeyPair keyPair = generateKeyPairs();
		PrivateKey privateKey = keyPair.getPrivate();
		PublicKey publicKey = keyPair.getPublic();
		storeKeys(dirPath + File.separator + "publickey.key", publicKey);
		storeKeys(dirPath + File.separator + "privatekey.key", privateKey);
		logger.info("存储公钥|私钥【" + dirPath + "】...");
	}

	public static PrivateKey getStoredPrivateKey(String filePath)
			throws Exception {
		byte[] keydata = getKeyData(filePath);
		PKCS8EncodedKeySpec encodedPrivateKey = new PKCS8EncodedKeySpec(keydata);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(encodedPrivateKey);
		return privateKey;
	}

	public static PublicKey getStoredPublicKey(String filePath)
			throws Exception {
		byte[] keydata = getKeyData(filePath);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec encodedPublicKey = new X509EncodedKeySpec(keydata);
		PublicKey publicKey = keyFactory.generatePublic(encodedPublicKey);
		return publicKey;
	}

	private static KeyPair generateKeyPairs() throws Exception {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);
		KeyPair keyPair = keyGen.genKeyPair();
		return keyPair;
	}

	private static void storeKeys(String filePath, Key key) throws Exception {
		byte[] keyBytes = key.getEncoded();
		FileOutputStream outStream = null;

		try {
			outStream = new FileOutputStream(filePath);
			outStream.write(keyBytes);
		} catch (Exception arg11) {
			throw arg11;
		} finally {
			if (outStream != null) {
				try {
					outStream.close();
				} catch (IOException arg10) {
					arg10.printStackTrace();
				}
			}

		}

	}

	private static byte[] getKeyData(String filePath) throws Exception {
		File file = new File(filePath);
		byte[] buffer = new byte[(int) file.length()];
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);
			fis.read(buffer);
		} catch (Exception arg11) {
			throw arg11;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException arg10) {
					arg10.printStackTrace();
				}
			}

		}

		return buffer;
	}
}