package com.employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String a;
        int b,c,d;
        float e;
        System.out.println("Enter your name");
        a=sc.next();

        System.out.println("Enter your DOB");
        b=sc.nextInt();

        System.out.println("Enter your month of birth");
        c=sc.nextInt();

        System.out.println("Enter your birth year");
        d=sc.nextInt();

        System.out.println("Enter your salary");
        e=sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.print(e);
        if(e>500000) {
            System.out.println("20% ");
        }
        else if (e>=400000){
            System.out.println("15%");
        }
        else if (e>=300000){
            System.out.println("10%");
        }
        else if (e>=200000){
            System.out.println("5%");
        }
        else{
            System.out.println("No increment");
        }
    }
}