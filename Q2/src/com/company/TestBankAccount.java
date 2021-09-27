/*
    * ict19858
    * ITC 1141 object oriented programming laboratory
    * Question 2
    * Mohamed Safras
*/

package com.company;



public class TestBankAccount {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("115-1-222", 35000);
        CurrentAccount currentAccount = new CurrentAccount("124-2-255",20000,10000);

        currentAccount.withdraw(25000);
        savingsAccount.deposit( 25000);
        currentAccount.withdraw(10000);
    }
}
