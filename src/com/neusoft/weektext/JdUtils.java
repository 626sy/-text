package com.neusoft.weektext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shihaobo
 * @date 2020/8/13 8:16
 */
public class JdUtils {
    public static Connection getConnection(){
        String driver = null;
        String url = "jdbc:mysql://127.0.0.1:3306/java9 ";
        String name = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,name,password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
