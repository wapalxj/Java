package HTTPS;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/**
 * Created by Administrator on 2016/9/25.
 */
public class TestHttps {

    public static void main(String[] args) {
        HttpsURLConnection sconn=null;
        InputStream is=null;
        BufferedReader reader=null;
        try {
//            URL urL=new URL("https://www.baidu.com");
            URL urL=new URL("https://certs.cac.washington.edu/CAtest/ ");
            System.out.println(urL.getProtocol());
            sconn= (HttpsURLConnection) urL.openConnection();
            sconn.setReadTimeout(8000);
            sconn.setConnectTimeout(8000);
            sconn.setRequestMethod("GET");
            sconn.connect();
            if (sconn.getResponseCode()==200){
                is=sconn.getInputStream();
                reader= new BufferedReader(new InputStreamReader(is));
                String line=null;
                while ((line=reader.readLine())!=null){
                    System.out.println(line);
                }
             }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void initSSL() throws CertificateException, IOException, KeyStoreException,
            NoSuchAlgorithmException, KeyManagementException {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        InputStream in = getAssets().open("load-der.crt");
        Certificate ca = cf.generateCertificate(in);

        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        keystore.load(null, null);
        keystore.setCertificateEntry("ca", ca);

        String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
        tmf.init(keystore);

        // Create an SSLContext that uses our TrustManager
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, tmf.getTrustManagers(), null);
        URL url = new URL("https://certs.cac.washington.edu/CAtest/");
        HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setSSLSocketFactory(context.getSocketFactory());
        InputStream input = urlConnection.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            result.append(line);
        }
        System.out.println(result.toString());
    }

}
