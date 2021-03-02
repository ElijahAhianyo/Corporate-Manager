package com.patterns.proxypattern.virtual;

public class Employee {

    private String employeeFirstName;
    private String employeeLastName;
    private String employeeAddress;
    private String employeePhoneNumber;

    public Employee(String employeeFirstName, String employeeLastName,String employeeAddress, String employeePhoneNumber){
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAddress = employeeAddress;
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String toString(){
        return "Employee Name: "+ employeeFirstName
                +"|| Employee Lastname: "+ employeeLastName
                +" ||  Employee Address: "+ employeeAddress
                + "|| Employee Phone number: "+ employeePhoneNumber;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }
}
