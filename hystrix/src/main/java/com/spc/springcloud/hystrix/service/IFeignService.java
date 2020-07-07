package com.spc.springcloud.hystrix.service;

import com.spc.springcloud.hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="provider")
public interface  IFeignService {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();
}
