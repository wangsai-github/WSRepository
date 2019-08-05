package com.example.springbootstudy.beans;

/**
 * @Title:Student
 * @Description:学生实体类
 * @author: wangsai
 * @date 2019/8/5 11:33
 */

public class Student {
    private int stuId;       //学生编号,唯一主键
    private String stuName;  //用户名
    private String passWord; //密码

    /**
     * 构造函数
     * @param stuId
     * @param stuName
     * @param passWord
     */
    public Student(int stuId, String stuName, String passWord) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.passWord = passWord;
    }

    public Student() {
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}