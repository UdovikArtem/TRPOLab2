package com.github.stokito.unitTestExample.calculator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число а: ");
        int a = sc.nextInt();
        System.out.println("\nВведите число b: ");
        int b = sc.nextInt();

        System.out.println("\nВыберете операцию (1 - сложение, 2 - вычетание, 3 - умножениe, 4 - деление): ");
        int userInput = sc.nextInt();
        
        System.out.println("\nИтог:");
        switch(userInput) {
            case(1):
                System.out.println(a + " + " + b + " = " + obj.sum(a, b));
                break;
            case(2):
                System.out.println(a + " - " + b + " = " + obj.minus(a, b));
                break;
            case(3):
                System.out.println(a + " * " + b + " = " + obj.multiply(a, b));
                break;
            case(4):
                System.out.println(a + " / " + b + " = " + obj.divide(a, b));
                break;
        }
        System.out.println("\n");
    }
}