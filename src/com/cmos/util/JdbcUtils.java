package com.cmos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtils {
    Connection conn = null;
    PreparedStatement pstmt = null;

    /**
     * 数据库连接
     */
    public Connection getConnection() throws SQLException{
        // 通过Config获取SQLServer数据库配置信息
        String driver = Config.getValue("driverClass");
        String url = Config.getValue("url");
        String user = Config.getValue("user");
        String pwd = Config.getValue("password");
        try {
            // 指定驱动程序
            Class.forName(driver);
            // 建立数据库连结
            conn = DriverManager.getConnection(url, user, pwd);

            return conn;
        } catch (Exception e) {
            // 如果连接过程出现异常，抛出异常信息
            throw new SQLException("驱动错误或连接失败！");
        }
    }
}
