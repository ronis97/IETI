package com.example.taskplanner.interceptor;

import com.example.taskplanner.Storage.ImplementedStorage;
import kotlin.jvm.Throws;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class AuthInterceptor {
    private ImplementedStorage storage;

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder request  = chain.request().newBuilder();
        String token = storage.getToken();
        if (!token.isEmpty()) {
            request.addHeader("Authorization", "Bearer $token");
        }
        return chain.proceed(request.build());
    }
}
