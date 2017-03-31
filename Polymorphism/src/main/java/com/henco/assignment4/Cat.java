package com.henco.assignment4;

/**
 * Created by Henco on 3/30/2017.
 */
public class Cat extends Pet
{
    public Cat()
    {

    }

    public Cat(String name, String speak)
    {
        super(name);
        setSpeak(speak);
    }

    public String toString() {
        return super.toString() + " and I " + getSpeak();
    }
}
