package com.databend.databendjdbcdemomybatis.service;



import com.databend.databendjdbcdemomybatis.entity.Student;

import java.util.List;

/**
 *
 * @author databend
 * @date 2024/02/22
 */
public interface StudentService {
    List<Student> index();
    Integer save(Student student);
}
