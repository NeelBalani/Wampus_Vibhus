package edu.bothell.wampus;

public class Vibhu extends Person{
    //interface teammate
    //person all classes extend person
    // Properties
    private String name = "vibhu";
    //change
    
    public Vibhu(){
        jobs.add("Hazards, Coins, Warnings");
    }

    public void Hello(){
        System.out.println("Hi im vibhu");
    }

    public void getJobs(){
        for(int i = 0; i < jobs.size(); i++){
            System.out.print(jobs.get(i) + " ");
        }
    }
}
