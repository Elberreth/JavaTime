package se.lexicon;

import java.util.*;
import java.util.Scanner;


public class Calculator2 {
    public static void main(String[] args) {
        Double number;
        System.out.println("Calculator");
        int num1;
        int num2;
        int scanner;
        boolean loop = true;
        String operation;


        Scanner input = new Scanner(System.in);



        boolean isTrue = true;

        while (isTrue) {

            System.out.println("*********************");
            System.out.println("Welcome to Calculator");
            System.out.println("*********************");




        System.out.println("please enter the first number");
        num1 = input.nextInt();



        System.out.println("please enter the second number");
        num2 = input.nextInt();


        System.out.println("Please enter operation");



        operation = input.next();


        if (operation.equals("+")) {
            System.out.println("your answer is " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("your answer is " + (num1 - num2));
        } else if (operation.equals("/")) {
            System.out.println("your answer is " + (num1 / num2));
        } else if (operation.equals("*")) {
            System.out.println("your answer is " + (num1 * num2));
        } else {
            System.out.println("Wrong selection");
        }



            System.out.println("Start? Press 5");
            System.out.println("Quit? Press 1");

            number = input.nextDouble();
            if (number == 5) {
                continue;


            } else if (number == 1)


                System.out.println("Goodbye");
            break;}






    }







}
