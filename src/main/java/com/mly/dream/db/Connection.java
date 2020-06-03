package com.mly.dream.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @program: DreamUtils
 * @Description: 数据库链接相关
 * @author: Mly
 * @create: 18:59 2020/6/3
 **/
public class Connection {

    /**
     * 加载设置数据库
     * @return
     */
    protected static java.sql.Connection getConnectionInit(){
        Properties pro = new Properties();
        String userName = "";
        String password = "";
        String url = "";
        String driverClass = "";
        java.sql.Connection connection = null;
        try {
            pro.load(ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties"));
            userName = pro.getProperty("user");
            password = pro.getProperty("password");
            url = pro.getProperty("url");
            driverClass = pro.getProperty("driverClass");
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, userName, password);
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

//    /**
//     * 关闭数据库链接(全部关闭)
//     * @return
//     */
//    protected static int closeConnection(){
//
//    }
}
