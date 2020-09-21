package com.song.test;

import java.sql.*;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/15 11:51
 */
public class TestJdbc {
    public static void main(String[] args) throws Exception {
        //配置信息
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=TRUE&characterEncoding=utf-8&useSSL=TRUE&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "";

        //1.加载驱动
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");

        //2.链接数据库,代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.向数据库发送sql对象 curd
        Statement statement = connection.createStatement();

        //4.编写sql
        String sql = "select * from test";

        //5.执行sql
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("id=" +resultSet.getObject("id"));
            System.out.println("coll=" +resultSet.getObject("coll"));
        }

        //6.关闭链接
        resultSet.close();
        statement.close();
        connection.close();

    }

}
