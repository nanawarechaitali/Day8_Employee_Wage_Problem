package com.bridgelabz;


import java.util.Random;

public class EmployeeWageProblem {
    static int Is_Present_Today =1;
    static int Is_Absent_Today=0;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem " );
        Random rand = new Random();
        int attendence = rand.nextInt(2);

        if(attendence == Is_Present_Today ){
            System.out.println("Employee is Present Today");
        }else{
            System.out.println("Employee is Absent Today");
        }


    }
}
