package com.company;

public class SavingAccount extends BankAccount{



    public SavingAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance, interestRate);
    }

    @Override
     void Withdraw(double withdrawAmount) {
        accountBalance-=withdrawAmount;
        if (accountBalance > 0){
            System.out.println("you have adequate balance is available");
        }
        else {
            System.out.println("you don't have adequate balance is available");
        }
    }

    public void addInterest( ){
        double interest = accountBalance * (interestRate/100);
        accountBalance= accountBalance+interest;
        System.out.println(accountBalance);
    }
}
