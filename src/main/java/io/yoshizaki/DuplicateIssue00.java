package io.yoshizaki;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateIssue00 {

    public static void main(String[] args){

        Person tom = new Person("Tom", "Smith");
        tom.setHobby("baseball");
        tom.setFavoriteFood("potato");

        Person alice = new Person("Alice", "Brown");
        alice.setHobby("music");
        alice.setFavoriteFood("cake");

        Set<Person> personSet = new LinkedHashSet<>();
        personSet.add(tom);
        personSet.add(alice);
        System.out.println( "check size : " + personSet.size() + " at first time.");
        // check size : 2 at first time.
        for(Person person : personSet) {
            System.out.println("first time check -> " + person);
        }
        // first time check -> Person{firstName='Tom', lastName='Smith', hobby='baseball', favoriteFood='potato'}
        // first time check -> Person{firstName='Alice', lastName='Brown', hobby='music', favoriteFood='cake'}

        Person tom2 = new Person("Tom", "Smith");
        tom.setHobby("football");
        tom.setFavoriteFood("beaf");
        personSet.add(tom2);
        System.out.println( "check size : " + personSet.size() + " at second time.");
        // check size : 2 at second time.
        for(Person person : personSet){
            System.out.println("second time check -> " + person);
        }
        // second time check -> Person{firstName='Tom', lastName='Smith', hobby='football', favoriteFood='beaf'}
        // second time check -> Person{firstName='Alice', lastName='Brown', hobby='music', favoriteFood='cake'}

    }
}
