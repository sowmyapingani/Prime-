package com.prime;

import java.util.Scanner;

public class PrimeOrNot {
    static boolean isprime(int number)
    {
        boolean isprime=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number % i==0)
            {
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the a number:");
        int number=scanner.nextInt();
        boolean result=isprime(number);
        if(result)
            System.out.println(number+" is prime");
        else
            System.out.println(number+" is not prime");
    }
}


