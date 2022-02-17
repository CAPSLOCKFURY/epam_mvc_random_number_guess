package com.company;

public class Model {

    private int goalNumber;

    private int failedAttemptsCount = 0;

    public Model(int goalNumber){
        this.goalNumber = goalNumber;
    }

    public int getGoalNumber(){
        return goalNumber;
    }

    public int getFailedAttemptsCount() {
        return failedAttemptsCount;
    }

    public void addFailedAttempt(){
        failedAttemptsCount++;
    }
}
