package edu.sdccd.cisc190;

public class Book {
    String ISBN;
    double price;
    int numberOrderedOfBook;
    public Book(String ISBN, double price, int numberOrderedOfBook) throws BlankISBN, NegativePrice, NegativeNumberOrdered {

        if(ISBN.equals("")) {
            throw new BlankISBN();
        }
        if(price<0) throw new NegativePrice();
        if(numberOrderedOfBook<0) throw new NegativeNumberOrdered();
        this.ISBN = ISBN;
        this.price = price;
        this.numberOrderedOfBook = numberOrderedOfBook;
    }
}
