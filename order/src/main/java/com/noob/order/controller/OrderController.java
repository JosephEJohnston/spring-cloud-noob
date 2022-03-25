package com.noob.order.controller;

import com.noob.order.feign.ProductFeignService;
import com.noob.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StockFeignService stockFeignService;

    @Autowired
    private ProductFeignService productFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");

        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);

        String msgSecond = stockFeignService.reduct();

        String pro = productFeignService.get(1);

        return "Hello World" + msg + msgSecond + pro;
    }
}
