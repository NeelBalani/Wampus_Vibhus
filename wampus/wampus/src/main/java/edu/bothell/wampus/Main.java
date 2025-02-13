package edu.bothell.wampus;

public class Main {
    public static void main(String[] args) {
        UI ui = new ConsoleUI();  // Students must implement ConsoleUI
        Controller controller = new Controller(ui); // Students must implement Controller

        // Add your custom Person implementation
        controller.addPerson(new Pranav("pranav"));

        controller.start();
    }
}