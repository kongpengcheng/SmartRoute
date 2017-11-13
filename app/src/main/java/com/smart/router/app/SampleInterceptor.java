package com.smart.router.app;

import android.content.Context;
import android.widget.Toast;

import com.smart.router.annotation.Interceptor;
import com.smart.router.router.RouteInterceptor;
import com.smart.router.router.RouteRequest;


/**
 * 自定义拦截器，通过注解指定name，就可以在Route中引用
 * <p>
 * Created by Cheney on 2017/3/6.
 */
@Interceptor("SampleInterceptor")
public class SampleInterceptor implements RouteInterceptor {
    @Override
    public boolean intercept(Context context, RouteRequest routeRequest) {
        Toast.makeText(context, String.format("Intercepted: {uri: %s, interceptor: %s}",
                routeRequest.getUri().toString(), SampleInterceptor.class.getName()),
                Toast.LENGTH_LONG).show();
        return true;
    }
}
