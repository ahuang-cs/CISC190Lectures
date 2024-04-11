package edu.sdccd.cisc190;

import java.util.Date;

public class AccountTransaction {
    public static enum Type {
        DEPOSIT, WITHDRAWAL, ADD_INTEREST
    }
    private Type transactionType;
    private Date transactionDate;
    private double amount;
    public AccountTransaction(Type transactionType, double amount) {
        this.transactionType = transactionType;
        this.transactionDate = new Date();
        this.amount = amount;
    }

    public Type getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Type transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return transactionDate + "\t" + transactionType + "\t" + amount;
    }
}
