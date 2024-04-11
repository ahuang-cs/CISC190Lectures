package edu.sdccd.cisc190;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount account;

    @BeforeEach
    void setUp() {
        account = new SavingsAccount(5000);
    }

    @Test
    void withdraw() {
        double curBalance = account.getBalance();
        account.withdraw(500);
        assertEquals(curBalance - 500, account.getBalance());
    }

    @Test
    void deposit() {
        double curBalance = account.getBalance();
        account.deposit(1500);
        assertEquals(curBalance + 1500, account.getBalance());
    }

    @Test
    void addInterest() {
        double curBalance = account.getBalance();
        double balanceWithOneMonthInterest = computeInterest(curBalance, 1);
        double balanceWithOneYearInterest = computeInterest(curBalance, 12);
        account.addInterest();
        assertEquals(balanceWithOneMonthInterest, account.getBalance());

        for(int i=0; i<11; i++) account.addInterest();

        assertEquals(balanceWithOneYearInterest, account.getBalance());
    }

    @AfterEach
    void printLedger() {
        System.out.println(account.getLedger());
    }

    private double computeInterest(double curBalance, int months) {
        for(int i=0; i<months; i++) {
            curBalance += curBalance * account.getAnnualInterestRate()/12;
        }

        return curBalance;
    }
}