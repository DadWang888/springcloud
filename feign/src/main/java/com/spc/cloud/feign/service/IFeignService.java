package com.spc.cloud.feign.service;

import com.spc.cloud.feign.service.impl.FeignServiceImpl;
import entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignServiceImpl.class)//fallback 设置熔断时执行的类方法
public interface IFeignService {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
