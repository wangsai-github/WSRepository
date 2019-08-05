package com.example.springbootstudy.dao;

import com.example.springbootstudy.beans.Student;

/**
 * @Title:StudentInfoDao
 * @Description:管理学生信息数据库操作接口
 * @author: wangsai
 * @date 2019/8/5 11:40
 */

public interface StudentInfoDao {
    /**
     * 查询个人学生信息
     * @param stuId
     * @return
     */
    Student getStudentInfo(int stuId);
}
