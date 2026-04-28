package com.example.ReactiveDemo1.Entity;

public class Payment {

    private long accNo;
    private String name;
    private long receiverAcc;
    private int amount;
    private String status;

    public Payment() {}

    public Payment(long accNo, String name, long receiverAcc, int amount, String status) {
        this.accNo = accNo;
        this.name = name;
        this.receiverAcc = receiverAcc;
        this.amount = amount;
        this.status = status;
    }

    // getters & setters
    public long getAccNo() { return accNo; }
    public void setAccNo(long accNo) { this.accNo = accNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getReceiverAcc() { return receiverAcc; }
    public void setReceiverAcc(long receiverAcc) { this.receiverAcc = receiverAcc; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}