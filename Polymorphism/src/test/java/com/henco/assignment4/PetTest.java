package com.henco.assignment4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Henco on 3/30/2017.
 */
public class PetTest {

    Pet pet1, pet2;

    @Test
    public void testSpeak() throws Exception
    {
        pet1 = new Cat();
        pet2 = new Dog();

        pet1.setSpeak("Meow");
        String obj1 = pet1.getSpeak();
        pet2.setSpeak("Woof");
        String obj2 = pet2.getSpeak();

        assertNotSame(obj1, obj2);
    }

    @Test
    public void testName() throws Exception
    {
        pet1 = new Cat();
        pet2 = new Dog();

        pet1.setName("Tom cat");
        String obj1 = pet1.getName();
        pet2.setName("Snoopy");
        String obj2 = pet2.getName();

        assertNotSame(obj1, obj2);
    }
}
