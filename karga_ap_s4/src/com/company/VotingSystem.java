package com.company;

import java.util.ArrayList;

/**
 * the system of voting that includes some voting in voting list
 *
 */
public class VotingSystem {
    private ArrayList<Voting> votingList=new ArrayList<>();

    public VotingSystem(){
        votingList=new ArrayList<>();
    }
    public void createVoting(String question,int type){
        Voting voting=new Voting(type,question);
        votingList.add(voting);

    }

    /**
     * print all votings in our voting list
     */
    public void printOfVotings(){
        int i=0;
        for (Voting v:votingList
             ) {
           System.out.println((i++)+v.getQuestion());
        }
    }


    /**
     * print the numberofVote'th from vote list
     * @param numberOfVote number of vote that we want to print
     */
    public void printVoting(int numberOfVote){

        if (numberOfVote<=votingList.size()) {
            System.out.println(votingList.get(numberOfVote).getQuestion());
            System.out.println(votingList.get(numberOfVote).getChoices().toString());

        }

    }

    /**
     * vote
     * @param numberOfVote number that must vote that
     * @param person the person that want to vote
     * @param choicesOfPerson entekhab haye shakhs
     */
    public void vote(int numberOfVote,Person person,ArrayList<String> choicesOfPerson){

       if (numberOfVote<=votingList.size())
         votingList.get(numberOfVote).vote(person,choicesOfPerson);



    }

    /**
     *
     * @param numberOfVoteings natijeye in shomare az liste votes ra midehad
     */

    public void printResult(int numberOfVoteings){
        System.out.println(votingList.get(numberOfVoteings).getQuestion());
        votingList.get(numberOfVoteings).printResults();
    }

    /**
     *
     * @return list haye vote hara bar migardaanad
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
}
