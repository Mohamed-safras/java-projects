package com.company;

abstract class BankAccount {
    private String accountNumber;
    double accountBalance,interestRate;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public BankAccount(String accountNumber,double accountBalance,double interestRate){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
    }

    public void Deposit( double depositAmount){
        accountBalance +=depositAmount;
        System.out.println(accountBalance);
    }

    abstract void Withdraw( double withdrawAmount );
}
