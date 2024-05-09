package edu.sdccd.cisc190;

//Write a public class named Customer, which is a subclass of the Person class.
public class Customer extends Person {
    //The Customer class should have the following fields:
    private String customerNumber; //a String to hold a customer number
    private boolean receiveMail; //a boolean to indicate whether the customer wishes to be on a mailing list
    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean receiveMail) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.receiveMail = receiveMail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean getReceiveMail() {
        return receiveMail;
    }

    public void setReceiveMail(boolean receiveMail) {
        this.receiveMail = receiveMail;
    }
}
