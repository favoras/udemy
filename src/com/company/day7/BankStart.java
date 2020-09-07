package com.company.day7;

public class BankStart {
    public static void main(String[] args) {

        Bank user1 = new Bank("AccNumber1", 100, "Edgaras", "email@gmail.com", "860555555");

        user1.withdraw(150);
        user1.deposit(75);
        System.out.println(user1.getBalance());
        user1.withdraw(150);
        System.out.println(user1.getBalance());

        Bank favoroacc = new Bank("Favoras", "twixas99@gmail.com", "860058399");

        System.out.println(favoroacc.getBalance());


    }
}


class Bank{
    private String accNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank(String accNumber, double balance, String name, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String name, String email, String phoneNumber) {
        this("AccNumber2", 1500.58, name, email, phoneNumber);
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available.");
        }else {
            this.balance -= withdrawAmount;
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
