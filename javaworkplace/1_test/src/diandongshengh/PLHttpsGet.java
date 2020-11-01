package diandongshengh;

import java.io.InputStream;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class PLHttpsGet {

	/**
	 * 忽视证书HostName
	 */
	private static HostnameVerifier ignoreHostnameVerifier = new HostnameVerifier() {
		public boolean verify(String s, SSLSession sslsession) {
			System.out.println("WARNING: Hostname is not matched for cert.");
			return true;
		}
	};

	/**
	 * Ignore Certification忽略证书
	 */
	private static TrustManager ignoreCertificationTrustManger = new X509TrustManager() {

		private X509Certificate[] certificates;

		@Override
		public void checkClientTrusted(X509Certificate certificates[], String authType) throws CertificateException {
			if (this.certificates == null) {
				this.certificates = certificates;
				System.out.println("init at checkClientTrusted");
			}

		}

		@Override
		public void checkServerTrusted(X509Certificate[] ax509certificate, String s) throws CertificateException {
			if (this.certificates == null) {
				this.certificates = ax509certificate;
				System.out.println("init at checkServerTrusted");
			}

			// for (int c = 0; c < certificates.length; c++) {
			// X509Certificate cert = certificates[c];
			// System.out.println(" Server certificate " + (c + 1) + ":");
			// System.out.println("  Subject DN: " + cert.getSubjectDN());
			// System.out.println("  Signature Algorithm: "
			// + cert.getSigAlgName());
			// System.out.println("  Valid from: " + cert.getNotBefore());
			// System.out.println("  Valid until: " + cert.getNotAfter());
			// System.out.println("  Issuer: " + cert.getIssuerDN());
			// }

		}

		@Override
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return null;
		}

	};

	public static String execute(String urlString) {

//		ByteArrayOutputStream buffer = new ByteArrayOutputStream(512);
		
		String s = "";
		
		try {

			URL url = new URL(urlString);

			/*
			 * use ignore host name verifier
			 */
			HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

			// Prepare SSL Context
			TrustManager[] tm = { ignoreCertificationTrustManger };
//			SSLContext sslContext = SSLContext.getInstance("TLS");
			SSLContext sslContext = SSLContext.getInstance("SSL");
			sslContext.init(null, tm, new java.security.SecureRandom());

			// 从上述SSLContext对象中得到SSLSocketFactory对象
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			connection.setSSLSocketFactory(ssf);
			//增加请求头__pl_partner
			connection.setRequestProperty("__pl_partner", "partner_byd");

			InputStream reader = connection.getInputStream();
			
			s = ResponseUtils.convertStreamToString(reader);

			connection.disconnect();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

		}
//		String repString = new String(buffer.toByteArray());
		return s;
	}
}
