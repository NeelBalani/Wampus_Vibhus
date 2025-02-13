package edu.bothell.wampus;

public class Main{
//Pranav Is testing
// Testing 123
    public static void main(String[] args){
        UI ui = new ConsoleUI();  // Students must implement ConsoleUI
        Controller controller = new Controller(ui); // Students must implement Controller

        // Students will create and add their own Person implementations
        // controller.addPerson(new GusReiber("Mr. Reiber"));
        

        controller.start();
    } 

}