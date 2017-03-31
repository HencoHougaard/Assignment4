package com.henco.assignment4;

/**
 * Created by Henco on 3/31/2017.
 */
public class Composition
{
    private Add addNum;
    private Multiply mulNum;

    public Composition(int addNum, int mulNum)
    {
        addNum = addNum;
        mulNum = mulNum;
    }

    public String toString()
    {
        return String.format("This is the sum total: %d/", addNum, "%d/This is the multiply total: %d/", mulNum);
    }
}
