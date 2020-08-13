package com.neusoft.weektext;

import java.sql.*;

/**
 * @author shihaobo
 * @date 2020/8/12 16:48
 */
public class searchInfo {
    public void searchInfo(int id){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from emp where id = ?";
        try {
            conn = JdUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
