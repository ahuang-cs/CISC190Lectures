package edu.sdccd.cisc190;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount {
    public static final double CURRENT_ANNUAL_INTEREST_RATE = 0.068;
    private double annualInterestRate;
    private double balance;
    private List<AccountTransaction> ledger = new ArrayList<>();

    public SavingsAccount(double balance) {
        annualInterestRate = CURRENT_ANNUAL_INTEREST_RATE;
        this.balance = balance;
        ledger.add(new AccountTransaction(AccountTransaction.Type.DEPOSIT, balance));
    }

    public void withdraw(double amount) {
        balance -= amount;
        ledger.add(new AccountTransaction(AccountTransaction.Type.WITHDRAWAL, balance));
    }

    public void deposit(double amount) {
        balance += amount;
        ledger.add(new AccountTransaction(AccountTransaction.Type.DEPOSIT, balance));
    }

    public void addInterest() {
        double interest = annualInterestRate / 12 * balance;
        balance += interest;
        ledger.add(new AccountTransaction(AccountTransaction.Type.ADD_INTEREST, interest));
    }

    public String getLedger() {
        StringBuilder output = new StringBuilder();
        output.append("Date\tType\tAmount\n");
        for(AccountTransaction transaction : ledger) {
            output.append(transaction.getTransactionDate());
            output.append("\t");
            output.append(transaction.getTransactionType());
            output.append("\t");
            output.append(transaction.getAmount());
            output.append("\n");
        }
        return output.toString();
    }

    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
