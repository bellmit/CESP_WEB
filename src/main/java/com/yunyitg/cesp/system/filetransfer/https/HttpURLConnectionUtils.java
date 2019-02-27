package com.yunyitg.cesp.system.filetransfer.https;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpURLConnectionUtils {
//	private static Log logger = LogFactory.getLog(HttpURLConnectionUtils.class);
	private static final Logger logger = LoggerFactory.getLogger(HttpURLConnectionUtils.class);

	public static String connection(String strUrl,
			Map<String, String> parameters) throws Exception {
		return connection(strUrl, "POST", parameters, "UTF-8");
	}

	public static String connection(String strUrl, String method,
			Map<String, String> parameters, String encode) throws Exception {
		new String();
		URL url = null;
		HttpURLConnection httpurlconnection = null;

		String result;
		try {
			if (strUrl.startsWith("https://")) {
				HttpsCertificates.trustAllHttpsCertificates();
			}

			url = new URL(strUrl);
			httpurlconnection = (HttpURLConnection) url.openConnection();
			if (httpurlconnection instanceof HttpsURLConnection) {
				((HttpsURLConnection) httpurlconnection)
						.setHostnameVerifier(new HostnameVerifier() {
							public boolean verify(String s,
									SSLSession sslsession) {
								return true;
							}
						});
			}

//			httpurlconnection.setConnectTimeout(1000 * 60);
//			httpurlconnection.setReadTimeout(1000 * 60);
			httpurlconnection.setDoOutput(true);
			httpurlconnection.setDoInput(true);
			httpurlconnection.setUseCaches(false);
			httpurlconnection.setRequestMethod(method);
			setParameter(httpurlconnection.getOutputStream(), parameters,
					encode);
			httpurlconnection.getOutputStream().flush();
			httpurlconnection.getOutputStream().close();
			httpurlconnection.connect();
			int code = httpurlconnection.getResponseCode();
			if (code != 200) {
				throw new Exception("返回错误状态【" + code + "】，请与系统管理员联系！");
			}

			result = getResult(httpurlconnection.getInputStream(), encode);
		} finally {
			if (httpurlconnection != null) {
				httpurlconnection.disconnect();
			}

		}

		return result;
	}

	public static String connection(String strUrl, String method,
			String parameters, String encode) throws Exception {
		new String();
		URL url = null;
		HttpURLConnection httpurlconnection = null;

		String result;
		try {
			if (strUrl.startsWith("https://")) {
				HttpsCertificates.trustAllHttpsCertificates();
			}

			url = new URL(strUrl);
			httpurlconnection = (HttpURLConnection) url.openConnection();
			if (httpurlconnection instanceof HttpsURLConnection) {
				((HttpsURLConnection) httpurlconnection)
						.setHostnameVerifier(new HostnameVerifier() {
							public boolean verify(String s,
									SSLSession sslsession) {
								return true;
							}
						});
			}

			httpurlconnection.setConnectTimeout('?');
			httpurlconnection.setReadTimeout('?');
			httpurlconnection.setDoOutput(true);
			httpurlconnection.setDoInput(true);
			httpurlconnection.setUseCaches(false);
			httpurlconnection.setRequestProperty("Content-Type", "text/html");
			httpurlconnection.setRequestProperty("Accept-Charset", encode);
			httpurlconnection.setRequestProperty("contentType", encode);
			httpurlconnection.setRequestMethod(method);
			if (parameters != null) {
				httpurlconnection.getOutputStream().write(
						parameters.getBytes(encode));
			}

			httpurlconnection.getOutputStream().flush();
			httpurlconnection.getOutputStream().close();
			httpurlconnection.connect();
			int e = httpurlconnection.getResponseCode();
			logger.debug("请求【"
					+ strUrl
					+ "】【"
					+ method
					+ "】【"
					+ encode
					+ "】【"
					+ (parameters.length() < 1000 ? parameters : parameters
							.substring(0, 1000) + "...") + "】返回状态【" + e + "】");
			if (e != 200) {
				throw new Exception("请求【"
						+ strUrl
						+ "】【"
						+ method
						+ "】【"
						+ encode
						+ "】【"
						+ (parameters.length() < 1000 ? parameters
								: parameters.substring(0, 1000) + "...")
						+ "】返回错误状态【" + e + "】，请与系统管理员联系！");
			}

			result = getResult(httpurlconnection.getInputStream(), encode);
		} catch (Exception arg10) {
			throw new Exception("请求【"
					+ strUrl
					+ "】【"
					+ method
					+ "】【"
					+ encode
					+ "】【"
					+ (parameters.length() < 1000 ? parameters
							: parameters.substring(0, 1000) + "...") + "】错误:"
					+ arg10.getMessage(), arg10);
		} finally {
			if (httpurlconnection != null) {
				httpurlconnection.disconnect();
			}

		}

		return result;
	}

	public static String getResult(InputStream inputStream, String encode)
			throws Exception {
		StringBuffer result = new StringBuffer();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream, encode));
		String lineSeparator = System.getProperty("line.separator");

		String inputLine;
		for (int lineNumber = 0; (inputLine = bufferedReader.readLine()) != null; result
				.append(inputLine)) {
			++lineNumber;
			if (lineNumber != 1) {
				result.append(lineSeparator);
			}
		}

		return result.toString();
	}

	public static boolean isURLExist(String url) {
		try {
			if (url.startsWith("https://")) {
				HttpsCertificates.trustAllHttpsCertificates();
			}

			URL e = new URL(url);
			HttpURLConnection urlconn = (HttpURLConnection) e.openConnection();
			int state = urlconn.getResponseCode();
			return state == 200;
		} catch (Exception arg3) {
			return false;
		}
	}

	public static String encodeURL(String url, String encode) {
		try {
			return URLEncoder.encode(url, encode);
		} catch (UnsupportedEncodingException arg2) {
			arg2.printStackTrace();
			return null;
		}
	}

	public static String decodeURL(String url, String encode) {
		try {
			return URLDecoder.decode(url, encode);
		} catch (UnsupportedEncodingException arg2) {
			arg2.printStackTrace();
			return null;
		}
	}

	public static String getParamString(Map<String, String[]> params,
			String encode) {
		StringBuffer queryString = new StringBuffer(256);
		Iterator it = params.keySet().iterator();
		int count = 0;

		while (it.hasNext()) {
			String key = (String) it.next();
			String[] param = (String[]) params.get(key);

			for (int i = 0; i < param.length; ++i) {
				if (count == 0) {
					++count;
				} else {
					queryString.append("&");
				}

				queryString.append(key);
				queryString.append("=");

				try {
					queryString.append(URLEncoder.encode(param[i], encode));
				} catch (UnsupportedEncodingException arg8) {
					;
				}
			}
		}

		return queryString.toString();
	}

	public static String getRequestURL(HttpServletRequest request, String encode) {
		StringBuffer originalURL = new StringBuffer(request.getServletPath());
		Map parameters = request.getParameterMap();
		if (parameters != null && parameters.size() > 0) {
			originalURL.append("?");
			originalURL.append(getParamString(parameters, encode));
		}

		return originalURL.toString();
	}

	private static void setParameter(OutputStream out,
			Map<String, String> parameterMap, String encode) throws Exception {
		if (parameterMap != null) {
			Iterator arg5 = parameterMap.entrySet().iterator();

			while (arg5.hasNext()) {
				Entry parameter = (Entry) arg5.next();
				String value = (String) parameter.getValue();
				if (StringUtils.isEmpty(value)) {
					value = "";
				}

				String temp = "&" + (String) parameter.getKey() + "="
						+ URLEncoder.encode(value, encode);
				out.write(temp.getBytes());
			}
		}

	}

	public static void main(String[] args) throws Exception {
	}
}