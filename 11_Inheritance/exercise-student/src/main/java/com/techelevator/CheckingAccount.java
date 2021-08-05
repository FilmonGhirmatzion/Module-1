package com.techelevator;


public class CheckingAccount extends BankAccount {


        public CheckingAccount(String accountHolder, String accountNumber, int balance) {
            super(accountHolder, accountNumber, balance);
        }
        public CheckingAccount(String accountHolder, String accountNumber) {
            super(accountHolder, accountNumber);
        }
        @Override
        public int withdraw(int amountToWithdraw) {
           if (getBalance() <=-100){
               return super.getBalance();

           }else if (getBalance()<0){
               return super.withdraw(amountToWithdraw +10);

           }
           return super.withdraw(amountToWithdraw);
        }
    }
