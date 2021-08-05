package com.techelevator;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountHolderName, String accountNumber) {

        super(accountHolderName, accountNumber);
    }


    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public int withdraw(int amountToWithdraw) {
        int currentBalance = getBalance();
        int withdrawnBalance = currentBalance - amountToWithdraw;
        if (withdrawnBalance < 150 && withdrawnBalance > 0) {
            return super.withdraw(amountToWithdraw + 2);
        } else if (withdrawnBalance < 0) {
            return currentBalance;
        } else {
            return super.withdraw(amountToWithdraw);
        }
    }
}