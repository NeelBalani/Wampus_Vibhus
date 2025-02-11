package edu.bothell.wampus;

public interface Teammate{

    Person getTeammateByName(String PersonName);

    void workTogether(Person p1, Person p2);

}