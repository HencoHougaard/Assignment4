package com.henco.assignment4;
/**
 * Created by Henco on 3/30/2017.
 */
public class Calculate
{
    public static void main(String[] args)
    {
        Add addObj = new Add();
        Subtract subObj = new Subtract();
        Multiply mulObj = new Multiply();
        Divide devObj = new Divide();

        addObj.num1=10;
        addObj.num2=5;
        addObj.sum();

        subObj.num1=10;
        subObj.num2=5;
        subObj.sum();

        mulObj.num1=10;
        mulObj.num2=5;
        mulObj.sum();

        devObj.num1=10;
        devObj.num2=5;
        devObj.sum();

        System.out.println(addObj.result);
        System.out.println(subObj.result);
        System.out.println(mulObj.result);
        System.out.println(devObj.result);

    }

}
