package com.henco.SRP;

/**
 * Created by Henco on 3/31/2017.
 */
public class Employee implements EmployeeInterface
{
    private String singnedOut;

    public Employee(String singnedOut)
    {
        this.singnedOut = singnedOut;
    }

    public String getSignIn()
    {
        return singnedOut;
    }

    public String SignIn(String in)
    {
        return singnedOut = in;
    }
}
