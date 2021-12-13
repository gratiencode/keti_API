/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import util.Token;

/**
 *
 * @author eroot
 */
public class KetiHelper {
     public static final String BASE_URL = 
            //"http://192.168.43.24/keti/v1/";
            "http://localhost:10008/keti/v1/";
   
    private static Retrofit retrofitRefresh = null;
    private static Retrofit retrofit = null;
    private static HttpAuthenticator auth = null;
    private static OnTokenRefreshedListener onTokenRefreshedListener;

    public KetiHelper() {
    }

   

    private static void notifytoken(Token token) {
        if (onTokenRefreshedListener != null) {
            onTokenRefreshedListener.onTokenRefreshed(token);
        }

    }

    public static void setOnTokenRefreshCallback(OnTokenRefreshedListener otrl) {
        onTokenRefreshedListener = otrl;
    }

    private static Retrofit getInstance(String token) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(300L, TimeUnit.SECONDS)
                .writeTimeout(5L, TimeUnit.MINUTES)
                .readTimeout(5L, TimeUnit.MINUTES);
        if (token != null) {
            HttpInterceptor intercep = new HttpInterceptor(token);
            builder.addInterceptor(intercep);
            Token t = new Token();
            t.setToken(token);
            intercep.setOnTokenRefreshedListener(new OnTokenRefreshedListener() {
                @Override
                public void onTokenRefreshed(Token token) {
                    KetiHelper.notifytoken(token);
                }
            });
        }
       
        try {
            TLSSocketFactory ssl=new TLSSocketFactory();
            if(ssl.getTrustManager()!=null){
               builder.sslSocketFactory(ssl, ssl.getTrustManager());
            }
        } catch (KeyStoreException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        OkHttpClient client = builder.build();
        retrofit = (new retrofit2.Retrofit.Builder()).baseUrl(BASE_URL)
                .client(client).addConverterFactory(JacksonConverterFactory.create()).build();
        return retrofit;
    }

    public static KetiAPI createService(String token) {
        return (KetiAPI)getInstance(token).create(KetiAPI.class);
    }


    public static Retrofit getInstanceRefresh() {
        try {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            TLSSocketFactory ssl=new TLSSocketFactory();
            if(ssl.getTrustManager()!=null){
                httpClient.sslSocketFactory(ssl, ssl.getTrustManager());
            }
            retrofitRefresh = (new retrofit2.Retrofit.Builder())
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(httpClient.build()).build();
        } catch (KeyStoreException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(KetiHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
         return retrofitRefresh;
    }
}
