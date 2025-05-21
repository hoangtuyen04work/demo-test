package com.example.demo_test;

import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final MyService myService;

    public Controller(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/test")
    public String test() {
        return myService.message(); // Sẽ trả về "Message cố định từ MyService!"
    }

    @GetMapping("/another")
    public String anotherTest() {
        return myService.anotherFixedFunction(); // Sẽ trả về "Đây là một chức năng cố định khác."
    }
}