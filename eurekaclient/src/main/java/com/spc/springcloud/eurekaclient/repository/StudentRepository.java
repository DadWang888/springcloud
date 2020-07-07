package com.spc.springcloud.eurekaclient.repository;

import com.spc.springcloud.eurekaclient.entity.Student;

import java.util.Collection;


public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student s);
    public void deleteById(long id);
}