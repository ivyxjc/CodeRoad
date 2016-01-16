package com.jc.service;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by jc on 1/4/2016.
 */
public class MyHttpClient {

    private CloseableHttpClient mClient;

    public String doGet(String url) {
        HttpUriRequest httpGet = new HttpGet(url);
        return request(httpGet);
    }

    public String doPost(String url) {
        HttpUriRequest httpPost = new HttpPost(url);
        return request(httpPost);
    }

    private String request(HttpUriRequest request) {
        try {
            CloseableHttpResponse response = mClient.execute(request);
            HttpEntity httpEntity = response.getEntity();
            return EntityUtils.toString(httpEntity);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
