package com.example.springbootstudy.iservice;

import com.example.springbootstudy.beans.Student;

/**
 * @Title:IStudentInfo
 * @Description:向外暴露的服务接口
 * @author: wangsai
 * @date 2019/8/5 12:41
 */
public interface IStudentInfo {
    Student getStudentInfo(int stuId);
}


