package edu.bothell.wampus;

public class Main {
    public static void main(String[] args) {
        UI ui = new ConsoleUI();
        Controller controller = new Controller(ui);

        controller.addPerson(new Pranav("Pranav"));

        controller.start();
    }
}
