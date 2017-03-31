package com.henco.LSP;

/**
 * Created by Henco on 3/31/2017.
 */
public class Tesla
{
    private CarInterface myCar = new Car();


    /* Tesla is an elictric car and does not have gears like an Audi.
        Both cars but Tesla does not change gears.
     */
    public int GearUp(int u)
    {
        return myCar.GearShiftUp(u);
    }

    public int GearDown(int d)
    {
        return myCar.GearShiftDown(d);
    }
}
