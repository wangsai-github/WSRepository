package com.example.springbootstudy.controller;


import com.example.springbootstudy.beans.Student;
import com.example.springbootstudy.iservice.IStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @author: wangsai
 * @date 2019/8/5 12:50
 */

@RestController
@RequestMapping(value = "/StudentInfo")
public class StudentInfoController {
    @Autowired
    IStudentInfo studentInfoSVimpl;

    @GetMapping(value = "/getStudentInfo/{stuId}")
    public Student getStudentInfo(@PathVariable(value = "stuId") int stuId){
        return studentInfoSVimpl.getStudentInfo(stuId);
    }
}