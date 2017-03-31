package com.henco.assignment4;

/**
 * Created by Henco on 3/30/2017.
 */
public class Pet
{
    private String name;
    private String speak;

    public Pet()
    {

    }

    public Pet(String name)
    {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return "\nMy name is " + name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

}
