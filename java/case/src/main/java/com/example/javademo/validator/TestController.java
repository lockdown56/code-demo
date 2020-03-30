package com.example.javademo.validator;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@RestController
@Validated
public class TestController {
    @GetMapping("/validator/test")
    public String test(@NotEmpty(message = "性别不能为空") @RequestParam(required = false) String sex) {

        return "OK";
    }
}
