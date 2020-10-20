package com.company;

import java.util.Scanner;

/**
 * تمام حالت ها در این کلاس چک شده
 * و چون تعداد حالت های رابط کاربری زیاد میشد
 * نمیدونستم که چه کارهایی رو برای رابط در نظر بگیرم
 * به همین خاطر تمامی حالات رو دستی امتحان کردم
 * تمیدوارم مورد قبولتون باشه
 * @author hadiNazemi
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        File file1=new File("I love her","1999","Sting");
        File file2=new File("shape of my heart","1990","Sting");
        File file3=new File("dance me to the end of love","1980","leonardoKohen");


        pop.addFile(file1);
        pop.addFile(file2);
        pop.addFile(file3);
        System.out.println("number of pop:");

        System.out.println(pop.getNumberOfFiles());
        System.out.println("////////////////////////////////////////");


        pop.listAllFiles();
        System.out.println("/////////////////////////////////////////");
        System.out.println("show file 2\'th");
        pop.listFile(2);


       // pop.removeFile(5);
        System.out.println("remove 1\'th file");
        pop.removeFile(1);

        System.out.println("///////////////////////////////////////");
        System.out.println("show all files:");
        pop.listAllFiles();
        System.out.println("///////////////////////////////////////");
        System.out.println("start playing 1");
        pop.startPlaying(1);
        System.out.println();
        System.out.println("start playing 5 that is out f list");
        pop.startPlaying(5);

        System.out.println("stop playing");

        pop.stopPlaying();
        System.out.println("add 1\' to favorite song");
        File searchFile=new File();
        searchFile= pop.searchInMusic("I love her","Sting");
        System.out.println("search  \"I love her\" in list");


        searchFile.printFile();



        System.out.println();
        System.out.println("print all favorite song");
        MusicCollection favoriteSonge=new MusicCollection();
        favoriteSonge.addFile(file1);
        favoriteSonge.listAllFiles();




















    }
}
