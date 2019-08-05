package com.example.springbootstudy.controller;


import com.example.springbootstudy.beans.Student;
import com.example.springbootstudy.iservice.IStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping(value = "/getStudentInfo/{stuId}")
//    public Student getStudentInfo(@PathVariable(value = "stuId") int stuId){
//        return studentInfoSVimpl.getStudentInfo(stuId);
//    }
@PostMapping(value = "/getStudentInfo")
public String getStudentInfo(@RequestParam(value = "studentId") int stuId,@RequestParam(value = "passWord")String passWord){
    Student student = new Student();
    student = studentInfoSVimpl.getStudentInfo(stuId);
    String ps = student.getPassWord();
    if(ps.equals(passWord)){
        return "登陆成功";
    }else{
        return "登陆失败";
    }
}
}