package com.henco.LSP;

/**
 * Created by Henco on 3/31/2017.
 */
public class Audi
{
    private CarInterface myCar = new Car();

    public int GearUp(int u)
    {
        return myCar.GearShiftUp(u);
    }

    public int GearDown(int d)
    {
        return myCar.GearShiftDown(d);
    }
}
