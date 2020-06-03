package com.mly.dream;

import com.mly.dream.db.DbUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: DreamUtils
 * @Description: 代码生成工具
 * @author: Mly
 * @create: 18:04 2020/6/3
 **/

public class CodeGenerate {
    public static void main(String[] args) throws SQLException {
        String sql = "select * from test1";
        PreparedStatement preparedStatement = DbUtils.getConnection().prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            System.out.println(id + name);
        }
    }
}
