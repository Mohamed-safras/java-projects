package com.company;

public class CurrentAccount extends BankAccount{


    public CurrentAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance, interestRate );
    }

    @Override
     void Withdraw(double withdrawAmount) {
        double minimumBalance = 10000;

        if(accountBalance > minimumBalance ){
            accountBalance-=withdrawAmount;
            System.out.println(accountBalance);
        }
        else {
            System.out.println("you minimum balance less than 10000");
        }
    }
}
