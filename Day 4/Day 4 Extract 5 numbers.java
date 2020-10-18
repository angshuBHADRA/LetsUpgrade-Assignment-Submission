Main.java

package com.employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i, n = 0, s = 0;
        
        System.out.println("Enter the 5 numbers: ");
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            n = in.nextInt();
            s += n;
        }

            
            System.out.println("The sum of 5 no is:" + s);


        }
    }