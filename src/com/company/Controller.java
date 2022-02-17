package com.company;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        boolean gameEnded = false;
        do {
            int input = inputIntValue(sc);
            userAttemptInfo(input, model.getGoalNumber());
            gameEnded = getGameState(input, model.getGoalNumber());
            if(!gameEnded){
                model.addFailedAttempt();
            }
        } while (!gameEnded);
    }

    private int inputIntValue(Scanner scanner){
        view.printMessage(View.INPUT_INTEGER_NUMBER);
        while (true){
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input >= 0 && input <= 100){
                    return input;
                }
            }
            view.printMessage(View.ERROR_NON_INT_INPUT);
            scanner.nextLine();
        }
    }

    private boolean getGameState(int number, int goal){
        return number == goal;
    }

    private void userAttemptInfo(int number, int goal){
        if(number < goal){
            view.printMessage(View.NUMBER_IS_LESS_THAN_GOAL);
        } else if(number > goal){
            view.printMessage(View.NUMBER_IS_BIGGER_THAN_GOAL);
        } else {
            view.printMessage(View.WIN_TEXT, model.getFailedAttemptsCount());
        }
    }

}
