package bank.management.system;

import  java.sql.*;

public class Conn {
     Statement s;
    Connection c;

    public Conn(){
        Connection connection;
        Statement statement;
        try{
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","1234567");
             s=c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
