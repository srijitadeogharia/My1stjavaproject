package UNIVERSITYMANG;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connect {
    Connection connection;


    Statement statement;

    Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/UNIVERSITYMANG","root","srij2005@diya08");
            Statement statement=connection.createStatement();
            statement.executeQuery("select * from createUNIVERSITYMANG");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
