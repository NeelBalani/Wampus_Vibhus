package edu.bothell.wampus;

public class Pranav extends Person{

        
    public Pranav(){
        jobs.add("Cave, Warnings");
    }

    public void HelloWorld(){
        System.out.println("Hello World");
    }


    public void getJobs(){
        for(int i = 0; i < jobs.size(); i++){
            System.out.print(jobs.get(i) + " ");
        }
    }
}