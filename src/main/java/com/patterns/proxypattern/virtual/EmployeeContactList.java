package com.patterns.proxypattern.virtual;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeContactList implements ContactList {
    private final String url = "jdbc:postgresql://localhost:5432/Data";
    private final String user = "postgres";
    private final String password = "postgres";


    @Override
    public List<Employee> getEmployeeList() {
        return getEmployeesFromDatabase();
    }
/*
 * make a database call to retrieve list a of employees
 * return List
 */
    private List<Employee> getEmployeesFromDatabase() {
        List<Employee> empList = new ArrayList<Employee>();
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * from users LIMIT 5")) {
             while (resultSet.next()) {
                empList.add(
                        new Employee(
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                resultSet.getString("address"),
                                resultSet.getString("phone_number")
                        )
                );
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


        return empList;
    }

}
