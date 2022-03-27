package com.noob.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomFeignInterceptor implements RequestInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("xxx", "xxx");
        requestTemplate.query("id", "111");
        requestTemplate.uri("/9");

        logger.info("feign 拦截器！");
    }
}
