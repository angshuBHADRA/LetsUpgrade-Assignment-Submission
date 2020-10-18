*Main.java

package com.employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);


            Avenger[] io=new Avenger[3];


            for(int i=0;i<5;i++)
            {
               io[i]=new Avenger();
               io[i].getDetails();
            }


            for(int i=0;i<5;i++)
            {
                io[i].displayDetails();
            }

        }
    }


*Avengers.java

package com.employee;
import java.util.Scanner;
public class Avenger {


    Scanner sc=new Scanner(System.in);
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;


    public void getDetails(){

        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the power");
        power=sc.nextLine();
        System.out.println("Enter your Weapon");
        weapon=sc.nextLine();
        System.out.println("Enter your planet");
        planet=sc.nextLine();
         
         }


    public void displayDetails(){

        System.out.println("The name is "+name+" and the age is "+age+" his power is "+power+" His weapon is "+weapon+" His planet is "+planet);

    }

}
