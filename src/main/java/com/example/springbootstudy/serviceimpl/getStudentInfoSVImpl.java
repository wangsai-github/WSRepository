package com.example.springbootstudy.serviceimpl;

import com.example.springbootstudy.beans.Student;
import com.example.springbootstudy.dao.StudentInfoDao;
import com.example.springbootstudy.iservice.IStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Description:
 * @author: wangsai
 * @date 2019/8/5 12:45
 */

@Service
public class getStudentInfoSVImpl implements IStudentInfo {
    //注入数据操作层相关操作方法
    @Autowired
    StudentInfoDao studentInfoDao;
    @Override
    public Student getStudentInfo(int stuId) {
        return this.studentInfoDao.getStudentInfo(stuId);
    }
}