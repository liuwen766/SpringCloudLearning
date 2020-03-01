package com.liuwen.controller;

import com.liuwen.entity.Student;
import com.liuwen.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-02-29 23:07
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }

    @Resource
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    private void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    private void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
}
