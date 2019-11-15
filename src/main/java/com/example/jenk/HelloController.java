package com.example.jenk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述 TODO
 *
 * @Auther: jun.shen
 * @Date: 2019/10/11 10:05
 */

@RestController
public class HelloController {

    @RequestMapping("/hello/test")
    public void test(){
        System.out.println("你好，我是haha,年龄：3岁。");
    }
}
