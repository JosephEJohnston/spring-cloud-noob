package com.noob.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 注意，从 nacos 里拿的
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {

    // 接口声明和原 web 接口完全一样
    @RequestMapping("/reduct")
    String reduct();

}
