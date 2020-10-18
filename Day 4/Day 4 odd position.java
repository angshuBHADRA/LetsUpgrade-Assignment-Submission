package com.employee;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};

                System.out.println("Elements of the array present on odd position: ");

                for (int counter= 0; counter < arr.length; counter= counter+2) {

                    System.out.println(arr[counter]);
                }

          }
    }

