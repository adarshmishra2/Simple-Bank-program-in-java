package com.company;

public class Main {

    public static void main(String[] args) {

        Bank adarshacc=new Bank("12345",56464,"adarsh","adarsh@gmail.com","9899889944");

        double accnum = adarshacc.getAccnum();
        double balance = adarshacc.getBalance();
        String custName = adarshacc.getCustname();
         
        System.out.println(accnum);
        System.out.println(balance);
        System.out.println(custName);





      adarshacc.withdraw(500);
      adarshacc.deposit(500);
      adarshacc.withdraw(250);
    }
}
