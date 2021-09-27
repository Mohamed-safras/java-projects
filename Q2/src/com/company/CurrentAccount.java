package com.company;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() > amount){
            super.setBalance(super.getBalance()-amount);
        }{
            System.out.println("Balance insufficient!");
        }
    }
}
