package edu.bothell.wampus;

public class Vibhu extends Person{
    
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
