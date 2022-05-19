package com.prime;

import java.util.Scanner;

public class Functions{
    static void add(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("Additon of "+num1+"and"+num2+"is:"+sum);

    }
    static void sub(int num1,int num2)
    {
        int sub=num1-num2;
        System.out.println("Substraction of "+num1+"and"+num2+"is:"+sub);

    }
    static void mul(int num1,int num2)
    {
        int mul=num1*num2;
        System.out.println("multiplication of "+num1+"and"+num2+"is:"+mul);

    }
    static void div(int num1,int num2)
    {
        int div=num1/num2;
        System.out.println("division of "+num1+"and"+num2+"is:"+div);

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=scanner.nextInt();
        System.out.println("enter the num2");
        int num2=scanner.nextInt();
        System.out.println("press 1 for addition \n press 2 for substraction \n press 3 for multiplication \n press 4 for division");
        System.out.println("enter the function");
        int Scanner= scanner.nextInt();
        switch(Scanner){
            case 1:add(num1,num2);
                break;
            case 2:sub(num1,num2);
                break;
            case 3:mul(num1,num2);
                break;
            case 4:div(num1,num2);
                break;
            default :System.out.println("enter the valid option");


        }


    }
}




