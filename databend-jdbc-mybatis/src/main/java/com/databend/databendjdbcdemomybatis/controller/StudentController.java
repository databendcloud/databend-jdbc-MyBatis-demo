package com.databend.databendjdbcdemomybatis.controller;

import com.databend.databendjdbcdemomybatis.entity.Student;
import com.databend.databendjdbcdemomybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Student Controller
 *
 * @author databend
 * @date 2024/02/22
 */

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping({"", "/", "index"})
    public String index() {
        return studentService.index().toString();
    }

    @GetMapping("/add/{name}/{age}")
    public String add(HttpServletRequest request, @PathVariable String name, @PathVariable Integer age) {
        Student model = new Student();
        model.setName(name);
        model.setAge(age);

        int res = studentService.save(model);
        return String.valueOf(res);
    }
}
