package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();


    @Override
    public int getBalance() {
        int totalBalnce =0;
        for (Accountable account : accounts){
            totalBalnce += account.getBalance();

        }
        return totalBalnce;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // methods
    public void addAccount(Accountable newAccount){
        this.accounts.add(newAccount);

    }
   public boolean isVip() {
       if (this.getBalance() >= 25000) {
           return true;
       }
       return false;

   }

}
