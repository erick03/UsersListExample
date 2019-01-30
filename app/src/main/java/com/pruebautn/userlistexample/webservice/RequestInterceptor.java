package com.pruebautn.userlistexample.webservice;

import com.pruebautn.userlistexample.utils.Constants;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request newRequest = chain.request().newBuilder()
                .addHeader(Constants.CONTENT_TYPE_INTERCEPTOR, Constants.APP_JSON_INTERCEPTOR)
                .addHeader(Constants.ACCEPT_INTERCEPTOR, Constants.APP_JSON_INTERCEPTOR)
                .build();
        return  chain.proceed(newRequest);
    }
}
