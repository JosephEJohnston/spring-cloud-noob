package com.noob.order.config;

import feign.Contract;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置：当使用 @Configuration，会将配置作用于所有的服务提供方
 * 局部配置：如果只想针对一个服务进行配置，就不要加 @Configuration
 */

// @Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 修改契约配置：支持 Feign 原生的注解
     * <p>多用于旧 spring-cloud 升级</p>
     */
    /*@Bean
    public Contract feignContract() {
        return new Contract.Default();
    }*/

    /**
     * 超时时间配置
     */
    /*@Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }*/
}
