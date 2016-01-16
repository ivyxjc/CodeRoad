package com.jc.Graph;

import java.sql.*;

/**
 * Created by jc on 12/7/2015.
 */
public class JDBCE {


    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/db_name";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";


    public static void JDBCexample(){
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Connection conn= DriverManager.getConnection(URL,USER,PASSWORD);
            Statement stmt=conn.createStatement();
            try{
                stmt.executeUpdate(
                        "insert into instructor values('77987','Kim','Physics,'98000)");
            }catch(SQLException sqle){
                System.out.println("Couldn't insert tuple ."+sqle);
            }
        }catch (Exception sqle){
            System.out.println("Exception "+sqle);
        }
    }

    public static void main(String[] args) {
        JDBCexample();
    }

}
