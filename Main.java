package com.company;

public class Main {

    public static void main(String[] args) {

        Bank adarshacc=new Bank("12345",56464,"adarsh","adarsh@gmail.com","9899889944");

        System.out.println(adarshacc.getAccnum());
        System.out.println(adarshacc.getBalance());
        System.out.println(adarshacc.getCustname());





      adarshacc.withdraw(500);
      adarshacc.deposit(500);
      adarshacc.withdraw(250);
    }
}
