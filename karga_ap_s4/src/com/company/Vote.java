package com.company;

import java.util.Objects;

public class Vote {
    private Person person=new Person();
    private String date;

    /**
     * constractor
     * @param person
     * @param date
     */
    public Vote(Person person,String date){
        this.date=date;
        this.person=person;

    }

    /**
     * constractor
     */
   public Vote(){
        person=new Person();
   }

    /**
     *
     * @return person
     */

    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }

    /**
     *
     */
    public void print(){
        System.out.println(person.getFirstName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) &&
                Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
