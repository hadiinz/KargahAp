package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here






        VotingSystem votingSystem=new VotingSystem();
        votingSystem.createVoting("behtarin khanande",1);

        //ezafe kardane candid ha be avalin nazar sanji(behtrin khanande)
        votingSystem.getVotingList().get(0).createChoice("gholam");
        votingSystem.getVotingList().get(0).createChoice("hadi");
       //avalin shakhse ray dehande
        Person p1=new Person("hadi","nazemi");
        ArrayList<String> choiceP1=new ArrayList<>();
        choiceP1.add("gholam");



        //2omin shakhse ray dehande
        Person p2=new Person("hamed","nazemi");
        ArrayList<String> chiceP2=new ArrayList<>();
        chiceP2.add("gholam");

        //sabte ray ha
        votingSystem.vote(0,p1,choiceP1);
        votingSystem.vote(0,p2,chiceP2);
        votingSystem.printResult(0);





        System.out.println("//////////////////////////////////////////");
        //print kardane soale kole nazar sanjia
        votingSystem.createVoting("behtarin bazigar",0);
        votingSystem.printOfVotings();






    }
}
