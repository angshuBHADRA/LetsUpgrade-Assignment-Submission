main.java

package com.employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float a, b, c, d, e, f;
        System.out.println("Enter Your English Marks");
        a = sc.nextInt();
        System.out.println("Enter Your Mathematics Marks");
        b = sc.nextInt();
        System.out.println("Enter Your Physics Marks");
        c = sc.nextInt();
        System.out.println("Enter Your Chemistry Marks");
        d = sc.nextInt();
        System.out.println("Enter Your Biology Marks");
        e = sc.nextInt();
        f = ((a + b + c + d + e)/500)*100;
        System.out.println(f);
        if (f > 90) {
            System.out.println("Grade A");
        } else if (f >= 70) {
            System.out.println("Grade B");
        } else if (f >= 50) {
            System.out.print("Grade C");
        } else {
            System.out.println("Better Luck Next Time");
        }
    }

}

