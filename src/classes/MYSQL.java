/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author thamo
 */
public class MYSQL {

    private static Connection c;

    private static final String username = "root";
    private static final String password = "1234";
    private static final String database = "lms";

    public static Statement CreateConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, username, password);
        }

        Statement s = c.createStatement();
        return s;
    }

    public static void insert(String query) {

        try {
            CreateConnection().executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ResultSet search(String query) throws Exception {

        ResultSet r = CreateConnection().executeQuery(query);

        return r;
    }
}
