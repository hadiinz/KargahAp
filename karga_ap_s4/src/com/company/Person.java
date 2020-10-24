package com.company;

/**
 * har shakhs ke dar nazar sanji sherkat mikonad objecti azin class ast
 */
public class Person {
    String firstName;
    String lastName;

    /**
     * costractor
     * @param firstName
     * @param lastName
     */
   public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }
    public Person(){

    }
     public  String getFirstName(){
        return firstName;
     }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
