package com.figjam.figjam.clients;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.Base64;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

//rest client for the user, holding the url
public class UserRestClient {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
//    private static final String BASE_URL = "http://192.168.1.130:8000/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(Context context, String url, Header[] headers, RequestParams params, AsyncHttpResponseHandler responseHandler){
        client.get(context, getAbsoluteUrl(url), headers, params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl){
        return BASE_URL + relativeUrl;
    }
}
