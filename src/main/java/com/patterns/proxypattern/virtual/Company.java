package com.patterns.proxypattern.virtual;

public class Company {

    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList companyContactList;

    public Company(String companyName,String companyAddress, String companyContactNo,ContactList companyContactList){
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.companyContactList = companyContactList;

        System.out.println("Company object created...");
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public ContactList getCompanyContactList(){
        return companyContactList;
    }

}