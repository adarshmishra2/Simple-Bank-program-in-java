package com.company;


public class Bank {

    private String accnum;
    private double balance;
    private String custname;
    private String email;
    private String phonenum;

    public Bank(String accnum, double balance, String custname, String email,String phonenum){
        this.accnum=accnum;
        this.balance=balance;
        this.custname=custname;
        this.email=email;
        this.phonenum=phonenum;
    }


    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void deposit(double depamount){
        this.balance+=depamount;
        System.out.println("deposit of "+depamount+"new balance is "+balance);
    }
    public void withdraw(double wdamount){
        if (balance-wdamount<=0){
            System.out.println("not much money, "+balance+"balance left");
        }
        else {
            balance-=wdamount;
            System.out.println("withdrwal of "+wdamount+"processed. Remaining balance is "+balance);
        }
    }
}
