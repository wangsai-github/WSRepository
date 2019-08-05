package com.cmos.model;

/**
 * @author WangSai
 * @Date 2019-7-12
 */
public class Student {
    private int stuNo;         //学生编号
    private String stuName;    //学生姓名
    private String stuClass;   //学生班级
    private String stuAddress; //学生住址
    private String stuPhone;   //学生电话

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Override
    public String toString() {
        return stuNo + " "+stuName+ " "+stuClass+ " "+stuAddress+ " "+stuPhone;
    }
}
