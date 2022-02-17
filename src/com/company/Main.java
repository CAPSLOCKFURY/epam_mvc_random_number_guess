package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        View view = new View();
        Model model = new Model(random.nextInt(101));
        Controller controller = new Controller(view, model);
        controller.processUser();
    }
}
