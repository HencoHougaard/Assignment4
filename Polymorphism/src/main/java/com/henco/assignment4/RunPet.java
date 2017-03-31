package com.henco.assignment4;

/**
 * Created by Henco on 3/30/2017.
 */
public class RunPet
{
    public static void main(String[] args)
    {
        Pet pet1 = new Cat("Tom cat", "Meow");
        System.out.println(pet1.toString());

        Pet pet2 = new Dog("Snoopy", "Woof");
        System.out.println(pet2.toString());
    }
}
