package zy.code.springboot06mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zy.code.springboot06mybatis.dao.StudentDao;
import zy.code.springboot06mybatis.domain.Student;

@RestController
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @GetMapping("/stu/{id}")
    public Student findById(@PathVariable("id") Integer id){
        Student stu = studentDao.findById(id);
        return stu;
    }
    @GetMapping("/stu")
    public Student insert(Student student){
        studentDao.insert(student);
        return student;
    }

}
