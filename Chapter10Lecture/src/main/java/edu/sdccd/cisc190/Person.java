package edu.sdccd.cisc190;

public class Person
{
    private String name;
    private String address;
    private String number;

    public Person(String n, String a, String num)
    {
        name = n;
        address = a;
        number = num;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getNumber()
    {
        return number;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setAddress(String a)
    {
        address = a;
    }

    public void setNumber(String n)
    {
        number = n;
    }
}