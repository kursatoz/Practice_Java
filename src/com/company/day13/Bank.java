package com.company.day13;

public class Bank {

  //  pseudocode ; plan and descriptions all coding steps

    /**
     *  -accountNumber
     *  -accountType
     *  -accountHolderName
     *  -accountBalance
     *
     * setAccountDetail()
     * accountInfo() ->> print all account information
     * showBalance() -->> print balance money
     * accountDeposit() -->> put money to balance
     * accountWithdraw() --> use many from balance
     * accountPurchase() --> online order price x items
     *
     */

    int accountNumber;
    String accountType;
    String accountHolderName;
    double accountBalance;

    public void setAccountDetail(String newHolderName, String newAccountType, int newAccountNumber, double newAccountBalance){
        accountHolderName = newHolderName;
        accountType = newAccountType;
        accountNumber = newAccountNumber;
        accountBalance = newAccountBalance;
    }

    public String accountInfo() {
        return "Personal Bank Account Info: " +
                "\naccountNumber=" + accountNumber +
                ", \naccountType='" + accountType + '\'' +
                ", \naccountHolderName='" + accountHolderName + '\'' +
                ", \naccountBalance=" + accountBalance;
    }
     public void getBalance(){
         System.out.println(accountHolderName +" has "+ accountBalance +"$");

     }

     public void accountDeposit(double amount){

        accountBalance += amount;
     }

     public void accountWithdraw(double amount){

        accountBalance -= amount;
     }
     public void accountPurchase(double price, int items){

        accountBalance -= price*items;
     }


}
