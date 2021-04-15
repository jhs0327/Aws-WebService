package com.jhs.book.springboot.web;

import com.jhs.book.springboot.vo.HelloResponseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/hello/vo")
    public HelloResponseVo helloResponseVo(@RequestParam("name") String name, @RequestParam("amount")int amount)
    {
        return new HelloResponseVo(name, amount);
    }
}
