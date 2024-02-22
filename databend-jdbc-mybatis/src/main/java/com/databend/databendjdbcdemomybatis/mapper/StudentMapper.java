package com.databend.databendjdbcdemomybatis.mapper;

import com.databend.databendjdbcdemomybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * @author databend
 * @date 2024/02/22
 */
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> list();

    int save(@Param("student") Student student);
}
