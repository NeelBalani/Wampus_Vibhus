package edu.bothell.wampus;

public class Neel extends Person{
    
    public Neel(){
        jobs.add("Bats, Wumpus, Scoring");
    }

    public void Hello(){
        System.out.println("Hi im neel");
    }

    public void getJobs(){
        for(int i = 0; i < jobs.size(); i++){
            System.out.print(jobs.get(i) + " ");
        }
    }
}
