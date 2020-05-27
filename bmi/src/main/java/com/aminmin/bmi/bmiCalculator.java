package com.aminmin.bmi;

public class bmiCalculator {
    public static void main(String[] args) {
        calculate(75, 1.6);
    }

    public static double calculate (double mass, double height){
        double bodyMassIndex;
        bodyMassIndex = mass/(height * height);
        if (bodyMassIndex>25){
            System.out.println("You are overweight!");
        } else if (bodyMassIndex > 18.5 && bodyMassIndex < 25){
            System.out.println("You are of normal weight!");
        } else if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight!");
        }
        return bodyMassIndex;
    }
}
