package com.henco.LSP;

/**
 * Created by Henco on 3/31/2017.
 */
public class Car implements CarInterface
{
    public String Drive(String drive)
    {
        if(drive == "move")
        {
            return "Car is Driving Forwards";
        }
        else
        {
            return "Car is stationary";
        }
    }

    public int GearShiftUp(int u)
    {
        int gear = u + 1;
        return gear;
    }

    public int GearShiftDown(int d)
    {
        int gear = d - 1;
        return gear;
    }
}
