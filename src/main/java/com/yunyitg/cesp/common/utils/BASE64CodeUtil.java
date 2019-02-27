package com.yunyitg.cesp.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class BASE64CodeUtil {
	public static String encodeFile(String fileName) {
		String imageBuffer = "";
		File file = new File(fileName);
		if (file.exists()) {
			try {
				FileInputStream e = null;
				byte[] data = (byte[]) null;

				try {
					e = new FileInputStream(fileName);
					data = new byte[e.available()];
					e.read(data);
					e.close();
				} catch (IOException arg5) {
					arg5.printStackTrace();
				}

				BASE64Encoder encoder = new BASE64Encoder();
				imageBuffer = encoder.encode(data);
			} catch (Exception arg6) {
				arg6.printStackTrace();
			}
		}

		return imageBuffer;
	}

	public static String encodeByte(byte[] data) {
		String imageBuffer = "";
		BASE64Encoder encoder = new BASE64Encoder();
		imageBuffer = encoder.encode(data);
		return imageBuffer;
	}

	public static String decodeFile(String content) {
		BASE64Decoder decode = new BASE64Decoder();
		String orgContent = "";

		try {
			byte[] b = decode.decodeBuffer(content);
			orgContent = new String(b, "UTF-8");
		} catch (IOException arg4) {
			arg4.printStackTrace();
		}

		return orgContent;
	}

	public static byte[] decodeString(String content) {
		BASE64Decoder decode = new BASE64Decoder();
		String orgContent = "";
		byte[] b = (byte[]) null;

		try {
			b = decode.decodeBuffer(content);
		} catch (IOException arg4) {
			arg4.printStackTrace();
		}

		return b;
	}
}
