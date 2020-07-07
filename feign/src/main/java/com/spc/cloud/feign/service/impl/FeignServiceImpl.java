package com.spc.cloud.feign.service.impl;

import com.spc.cloud.feign.service.IFeignService;
import entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignServiceImpl implements IFeignService {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。";
    }
}
