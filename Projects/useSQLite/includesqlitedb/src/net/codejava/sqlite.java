package net.codejava;

import java.sql.*;

public class sqlite {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:/D:\\test.db";
        try{
            Connection connection = DriverManager.getConnection(jdbcUrl);
            String all = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet result =  statement.executeQuery(all);

            while (result.next()) {
                String name = result.getString("name");
               int age = result.getInt("age");
                System.out.println("Name : " + name + "Age : "+ age);
            }
        }
        catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();

        }

    }
}
