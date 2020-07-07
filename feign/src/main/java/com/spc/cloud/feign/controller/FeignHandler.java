package com.spc.cloud.feign.controller;

import com.spc.cloud.feign.service.IFeignService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private IFeignService iFeignService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return iFeignService.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return iFeignService.index();
    }

}
