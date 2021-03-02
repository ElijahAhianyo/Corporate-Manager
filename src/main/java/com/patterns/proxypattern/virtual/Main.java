package com.patterns.proxypattern.virtual;

import java.sql.*;
import java.util.List;


public class Main {
    public static void  main(String [] args) throws SQLException {
        ContactList contactList = new EmployeeContactListProxy();
        Company company = new Company("Turntabl", "Sonnidom House", "+23311111111", contactList);

        System.out.println("Company Name: "+company.getCompanyName());
        System.out.println("Company Address: "+company.getCompanyAddress());
        System.out.println("Company Contact No.: "+company.getCompanyContactNo());

        System.out.println("Requesting for contact list");

        contactList = company.getCompanyContactList();

        List<Employee> empList = contactList.getEmployeeList();
        for(Employee emp : empList){
            System.out.println(emp);
        }

    }

}
