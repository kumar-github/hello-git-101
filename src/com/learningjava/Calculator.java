package com.learningjava;

public class Calculator
{
    public boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd(int number)
    {
        if(number%2!=0)
        {
            return true;
        }
        return false;
    }


}
