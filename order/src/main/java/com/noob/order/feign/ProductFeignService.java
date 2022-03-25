package com.noob.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", path = "/product")
public interface ProductFeignService {

    @RequestMapping("/{id}") // @RequestLine
    String get(@PathVariable("id") Integer id); // @Param
}
