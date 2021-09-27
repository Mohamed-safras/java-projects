package com.company;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() >=amount){
            super.setBalance(super.getBalance()-amount);

        }{
            System.out.println("Balance insufficient!");
        }
    }
}
