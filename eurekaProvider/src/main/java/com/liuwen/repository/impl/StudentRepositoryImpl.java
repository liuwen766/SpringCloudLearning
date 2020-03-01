package com.liuwen.repository.impl;

import com.liuwen.entity.Student;
import com.liuwen.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-02-29 22:57
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static{
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"西西",18));
        studentMap.put(2L,new Student(2L,"刘稳",19));
        studentMap.put(3L,new Student(3L,"康康",20));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
      return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
