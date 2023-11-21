package se.lexicon;
import java.util.Scanner;
//public class Loops {
    //public static void checkCalc(){


public class Main {

public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        checkCalc();}


            //checkCalc();


public static void checkCalc(){
    boolean checkCalc = true;

    System.out.println("**************");
    System.out.println("Welcome to Calculator");
    System.out.println("**************");
    System.out.println("Press -1 to quit");
    System.out.println("**************");
    while (checkCalc) {

        int quit;
        int num1;
        int num2;
        boolean num3 = false;

        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println("your answer is " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("your answer is " + (num1 - num2));
        } else if (operation.equals("/")) {
            System.out.println("your answer is " + (num1 / num2));
        } else if (operation.equals("*")) {
            System.out.println("your answer is " + (num1 * num2));
            //System.out.println("Press -1 to quit");
        } else if  (operation.equals("-1")){
            System.out.println("Quit" + (num3)) ;
        }


            //System.out.println("Continue? Or press -1 to quit");

        }}}





           // }else{
                //System.out.println("quit");
