package com.company.Khamis;
import java.util.Scanner;
/*
Write a class that can be used to collect user input and has
three methods:
• public String promptString(String message)
• public int promptInt(String message)
• public double promptDouble(String message)
Each of these methods should prompt the user for input
using the specified message and return the a String, int, or
double, depending on the method. The methods should
catch any exceptions due to bad input and continue to
prompt the user for input until valid input is supplied.
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aInteger = input.promptInt();
        System.out.println("The integer is " + aInteger);
        double aDouble = input.promptDouble();
        System.out.println("The double is " + aDouble);
        input.promptString();
    }
    static class UserInput {
        int promptInt() {
            System.out.println("Enter an integer");
            String userInput = input.nextLine();
            int userInt = 0;
            boolean isInt = false;
            while (!isInt) {
                try {
                    userInt = Integer.parseInt(userInput);
                    isInt = true;
                } catch (NumberFormatException e) {
                    System.out.println(userInput + " is not a valid integer. " + "Enter an integer.");
                    userInput = input.nextLine();
                }
            }
            return userInt;
        }
        void promptString() {
            System.out.println("Enter a string");
            String userInput = input.nextLine();
            boolean isString = true;
            while (isString) {
                try {
                    if(Integer.parseInt(userInput)<=0 || Integer.parseInt(userInput)>=0 || Double.parseDouble(userInput)<=0 ||  Double.parseDouble(userInput)>=0){
                        System.out.println(userInput + " is not a valid string. " + "Enter a string.");
                        isString = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("String works " );
                    userInput = input.nextLine();
                    isString = true;
                }
            }
        }
        double promptDouble() {
            System.out.println("Enter a double");
            String userInput = input.nextLine();
            double userDouble = 0;
            boolean isDouble = false;
            while (!isDouble) {
                try {
                    userDouble = Double.parseDouble(userInput);
                    isDouble = true;
                } catch (NumberFormatException e) {
                    System.out.println(userInput + " is not a valid double. " + "Enter a double.");
                    userInput = input.nextLine();
                }
            }
            return userDouble;
        }
    }
}




