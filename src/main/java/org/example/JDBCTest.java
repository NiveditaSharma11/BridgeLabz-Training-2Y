package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//step-1: load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver is loaded");

//step-2: open a connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "nivi123");
                System.out.println("connection is opened wit database");

//step-3: create statement object
        Statement stmt = conn.createStatement();
        System.out.println("statement object is created");

//step-4: execute the query
        /*String sqlQuery = "CREATE TABLE EMPLOYEE ("
                + "EID INT, "
                + "ENAME VARCHAR(20), "
                + "DEPARTMENT VARCHAR(20), "
                + "AGE INT, "
                + "PRIMARY KEY(EID, DEPARTMENT)"
                + ")" ;
        stmt.executeUpdate(sqlQuery);*/
        String insert_query_1 = "INSERT INTO EMPLOYEE" +" VALUES (101, 'Anil', '20', 590)";
        String insert_query_2 = "INSERT INTO EMPLOYEE" +" VALUES (102, 'Jyoti', '30', 487)";
        String insert_query_3 = "INSERT INTO EMPLOYEE" +" VALUES (101, 'Ankit', '40', 390)";
        stmt.executeUpdate(insert_query_1);
        stmt.executeUpdate(insert_query_2);
        stmt.executeUpdate(insert_query_3);
        System.out.println("insert queries are executed.");

//step-5: process the result
        System.out.println("Table is created");

//step-6: close the connection
        stmt.close();
        conn.close();
        System.out.println("connection is closed");
    }
}
