package com.example.jdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcVintage {
    static {
        try {
            Class.forName("org.h2.Driver");

        } catch (ClassNotFoundException e){/*..*/}

    }

    public static void main (String[] args){
        try(Connection con =
                    DriverManager.getConnection("jdbc:h2~/work", "sa","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select count(0) from authors");){
            rs.next();
            System.out.println("Table has " + rs.getInt(1) + "rows");
        } catch (SQLException se){
            /*...*/
        }

    }
}
