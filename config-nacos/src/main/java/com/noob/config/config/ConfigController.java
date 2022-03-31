package com.noob.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope // 动态更新 @Value 中的值
public class ConfigController {

    @Value("${user.name}")
    private String username;

    @RequestMapping("/show")
    public String show() {
        return username;
    }

}
