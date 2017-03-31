package com.henco.assignment4;
/**
 * Created by Henco on 3/30/2017.
 */
public class Calculate {

    public static void main(String[] args) {
        Add addObj = new Add();
        Multiply mulObj = new Multiply();

        addObj.num1=10;
        addObj.num2=5;
        addObj.sum();

        mulObj.num1=10;
        mulObj.num2=5;
        mulObj.multiply();

        Composition compObj = new Composition(15, 50);

        System.out.println(compObj);
    }

}
