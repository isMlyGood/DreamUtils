package com.mly.dream.db;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @program: DreamUtils
 * @Description: 数据库相关工具类
 * @author: Mly
 * @create: 18:06 2020/6/3
 **/
public class DbUtils extends com.mly.dream.db.Connection {

    /**
     * 获取数据库链接
     * @return
     */
    public static Connection getConnection(){
        return getConnectionInit();
    }

//    /**
//     * 关闭数据库链接
//     * @return
//     */
//    public static String close(){
//        int i = closeConnection();
//
//        return "";
//    }



}
