package com.example.project;

public class Account {
    //Attributes
    private int accountNo;
    private String name;
    private float amount;


    // Contracture:
    // Default contracture:
    public Account() {
    }

    // Parameterized Constructor
    public Account(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    // Copy Constructor
    public Account(Account account) {
        this.accountNo = account.accountNo;
        this.name = account.name;
        this.amount = account.amount;
    }

    // Getters && Setters
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


    // Methods:
    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amount) {
        this.amount += amount;
        System.out.println("Deposit amount " + amount + " to account " + accountNo);
    }

    public void withdraw(float amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient fund");
        } else {
            this.amount -= amount;
            System.out.println("Withdraw amount " + amount + " to account " + accountNo);
        }
    }

    public void balance() {
        System.out.println("Your balance is: " + this.amount);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNo= " + accountNo +
                ", name= '" + name + '\'' +
                ", amount= " + amount +
                '}';
    }
}
