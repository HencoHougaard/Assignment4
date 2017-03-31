package com.henco.assignment4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henco on 3/30/2017.
 */
public class testEncapsulation
{
    Employee emp1, emp2;

    @Test
    public void testSetName() throws Exception
    {
        emp1 = new Employee();
        emp2 = new Employee();

        emp1.setEmpName("Henco");
        String obj1 = emp1.getEmpName();
        emp2.setEmpName("Naeem");
        String obj2 = emp2.getEmpName();

        assertSame(emp1, obj1);
        assertSame(emp2, obj2);

    }
}
