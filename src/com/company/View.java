package com.company;

public class View {
    public final static String INPUT_INTEGER_NUMBER = "Enter positive integer number between 0 and 100: ";
    public final static String NUMBER_IS_LESS_THAN_GOAL = "Your number is less than the goal";
    public final static String NUMBER_IS_BIGGER_THAN_GOAL = "Your number is bigger than the goal";
    public final static String WIN_TEXT = "You guessed the number correct, number of wrong attempts: ";
    public final static String ERROR_NON_INT_INPUT = "Please enter positive integer number between 0 and 100: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message, int number){
        System.out.println(message + number);
    }
}
