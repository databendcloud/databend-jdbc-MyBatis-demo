package com.databend.databendjdbcdemomybatis.service.impl;

import com.databend.databendjdbcdemomybatis.entity.Student;
import com.databend.databendjdbcdemomybatis.mapper.StudentMapper;
import com.databend.databendjdbcdemomybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author databend
 * @date 2024/02/22
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> index() {
        return studentMapper.list();
    }

    @Override
    public Integer save(Student student) {
        return studentMapper.save(student);
    }
}
