package edu.sdccd.cisc190;

public class Person
{
    private String name;

    public Person(String n)
    {
        name = n;
    }

    public Person(Person otherPerson)
    {
        name = otherPerson.name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}