package com.umanizales.api_arrays.service.utills;

import java.math.BigInteger;

public class RecursiveUtills {
    public int factorial(int num)
    {
        int fact=1;

        if(num!=1)
        {
            fact= num*factorial(num -1);
        }
        return fact;
    }

    public BigInteger factorial(BigInteger num)
    {
        BigInteger fact=BigInteger.ONE;

        if(!num.equals(BigInteger.ONE))
        {
            fact= num.multiply(factorial(num.subtract(BigInteger.ONE)));
        }
        return fact;
    }
}
