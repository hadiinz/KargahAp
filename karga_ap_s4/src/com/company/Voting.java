package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Voting {
    private String question;
    private int type;
    private ArrayList<Person>voters;
    private HashMap<String,HashSet<Vote>> choices;

    /**
     * constractor
     * @param type noee ray dehi
     * @param question soal nazarsanji
     */
    public Voting(int type,String question){
        this.type=type;
        this.question=question;
        voters=new ArrayList<>();
        choices=new HashMap<>();
    }

    /**
     *
     * @return string of question
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @return array list of voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    /**
     * create new choice for vote
     * @param namein name of choice
     */
    public void createChoice(String namein){


        HashSet<Vote> votes=new HashSet<>();

        choices.put(namein,votes);

    }

    /**
     * yek shakhs va entekhab hayash ra migirad va bar asas type be vote ezafe mikonad
     * @param p1
     * @param choisesPerson
     */
    public void vote(Person p1,ArrayList<String> choisesPerson){

        voters.add(p1);
        JalaliCalendar j1=new JalaliCalendar();
        String d1=j1.getYear()+" "+j1.getMonth()+" "+j1.getDay();
        Vote vote1=new Vote(p1,d1);
        HashSet<Vote> temp=new HashSet<>();

        //agar entekhabe chanta azad bod
        if(type==1){

            for (String c:choisesPerson
                 ) {
                if(choices.containsKey(c)){

                    temp=choices.get(c);
                    temp.add(vote1);
                    choices.replace(c,temp);
                }

            }
         }
        //agar faghat yek entekhab dasht
        if(type==0){
            String s1=choisesPerson.get(0);
            if (choices.containsKey(s1)){
                temp=choices.get(s1);
                temp.add(vote1);
                choices.replace(s1,temp);
            }

        }




    }
    /**
     * kole natayej ra chap mikond
     */
    public void printResults(){

        for (String c:choices.keySet()
             ) {

            HashSet<Vote> v1=choices.get(c);
            System.out.println("esme candid:"+c);
           System.out.println("tedad ray:"+choices.get(c).size());




        }

    }

    /**
     * kole voters haa ro chap mikone
     */
    public void printVotes(){
        for (Person p:voters
             ) {
            System.out.println(p.toString());


        }
    }





}
