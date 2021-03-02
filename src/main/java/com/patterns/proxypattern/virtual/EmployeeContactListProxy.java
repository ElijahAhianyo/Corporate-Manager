package com.patterns.proxypattern.virtual;

import java.sql.SQLException;
import java.util.List;

public class EmployeeContactListProxy implements ContactList{

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList(){
        if(contactList == null){
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new EmployeeContactList();
        }
        return contactList.getEmployeeList();
    }

}