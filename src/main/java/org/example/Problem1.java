package org.example;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double a= scanner.nextDouble();

        System.out.println("Enter Second Number: ");
        double b=scanner.nextDouble();

        System.out.println("Enter Type of Operation: ");
        String op=scanner.next();

        double result=calculator(a,b,op);
        System.out.println(result);
    }
    public static double calculator(double a,double b,String operation)
    {
        switch (operation)
        {
            case "+":
                return a + b;

            case "-":
                return a-b;

            case "/":
                if(b==0)
                {
                    System.out.println("Cannot Divide by 0");
                    return 0;
                }
                else {
                    return a / b;
                }
            case "%":
                if(b==0)
                {
                    System.out.println("Cannot Divide by 0");
                    return 0;
                }
                else {
                    return a % b;
                }

            default:
                System.out.println("Wrong operation");
                return 0;
        }
    }
}

