package com.company.day13;

public class PersonalAccount {

    public static void main(String[] args) {

        Bank person1 = new Bank();

        person1.setAccountDetail("Amr Mohamed","Saving",65543364,15501.12);
        person1.accountPurchase(550.50,2);
        person1.getBalance();
        person1.accountDeposit(5025.25);
        person1.getBalance();
    }

}
