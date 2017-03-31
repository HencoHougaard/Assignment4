package com.henco.assignment4;

/**
 * Created by Henco on 3/28/2017.
 */
public class EncapsulationRun
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setEmpID(213021625);
        emp1.setEmpName("Henco");
        emp1.setEmpSurname("Hougaard");

        emp2.setEmpID(211135025);
        emp2.setEmpName("Naeem");
        emp2.setEmpSurname("Bux");

        System.out.println(emp1.getEmpName());
        System.out.println(emp2.getEmpName());

    }

}
