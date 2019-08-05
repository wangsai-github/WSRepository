package com.cmos.dao;

import com.cmos.model.Student;
import com.cmos.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author WangSai
 * @Date 2019-7-12
 */
public class AddStuInfoDaoImpl implements AddStuInfoDao {
    @Override
    public void addStuInfo(Student stu)throws Exception {
        JdbcUtils db = new JdbcUtils();
        Connection conn=null;
        try {
            conn = db.getConnection();
            String sql="insert into t_test_asiainfo(title1,title2,title3,title4) values (?,?,?,?)";
            System.out.println(conn == null);
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,stu.getStuName());
            pst.setString(2,stu.getStuClass());
            pst.setString(3,stu.getStuAddress());
            pst.setString(4,stu.getStuPhone());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("添加数据失败！");
        }finally{
            conn.close();
        }

    }
}
