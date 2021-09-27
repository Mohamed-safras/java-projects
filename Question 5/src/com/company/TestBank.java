package com.company;

public class TestBank {
    public static void main(String[] args) {
        SavingAccount SavingAccount1 = new SavingAccount("124-23-12",8000.00,4.0);
        CurrentAccount CurrentAccount1 = new CurrentAccount("124-31-58",50000.00,0.0);

        CurrentAccount1.Withdraw(12000);
        SavingAccount1.Deposit(12000);
        SavingAccount1.addInterest();



    }
}
