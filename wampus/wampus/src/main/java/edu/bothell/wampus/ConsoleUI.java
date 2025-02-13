package edu.bothell.wampus;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements UI{
    // Properties

    // Constructors

    public ConsoleUI(){

    }

    // Methods

    public void showMessage(String message){
        System.out.println(message);
    }
    public void showPersonTurn(Person person){

    }
    public int getActionChoice(List<String> actions){
        Scanner scanner = new Scanner(System.in);

        for(int index = 0; index < actions.size(); index++){
            showMessage(index + ": " + actions.get(index));
        } showMessage("Type the number of the action you want to do");

        String action = scanner.nextLine();
        int actionChoice = Integer.parseInt(action);
        scanner.close();

        return actionChoice;

    }
    public boolean askToContinue(String name){
        Scanner scanner = new Scanner(System.in);
        showMessage("Do you want to continue (y/n)");
        String choiceString = scanner.nextLine();

        boolean choice = true;
        if(choiceString.equals("n")){
            choice = false;
        }

        scanner.close();
        return choice;
    }
    public void displaySummary(){}

}
