package com.company;

public class Daneshkadeh {
    private Lab[] lab;
    String namedaneshkade;
    int tedadLab;
    int currentLab;
    public Daneshkadeh(String namedaneshkade,int tedadLab){
        this.namedaneshkade=namedaneshkade;
        this.tedadLab=tedadLab;
        lab=new Lab[tedadLab];
        currentLab=0;

    }
    public int getTedadLab(){
        return tedadLab;
    }
    public void addLab(Lab labb){
        lab[currentLab]=labb;
        currentLab++;

    }
    public void print(){
        System.out.println(namedaneshkade+"     "+"tedad Lab"+currentLab);
        for (int i=0;i<currentLab;i++)lab[i].print();
    }

}
