package com.spc.springcloud.hystrix.controller;
import com.spc.springcloud.hystrix.entity.Student;
import com.spc.springcloud.hystrix.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private IFeignService feignservice;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignservice.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignservice.index();
    }

}