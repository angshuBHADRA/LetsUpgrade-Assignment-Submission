Main.java

package com.employee;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Details");
        String name=sc.next();

        Employee ai=new Employee();
        ai.display(name);
    }

}

Employee.java

public class Employee {
    public void display(String name){

       System.out.println("The name is "+ name);
       System.out.println("19");
       System.out.println("Bangalore");
    }
}
