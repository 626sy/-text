package com.neusoft.weektext;

import java.sql.*;

/**
 * @author shihaobo
 * @date 2020/8/12 16:48
 */
public class shujukulianjie {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java9 ";
        Connection conn = DriverManager.getConnection(url,"root","root");
        Statement stmt = conn.createStatement();
        String sql = "select * from emp ";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            String name = rs.getString("Ename");

        }

    }
}
