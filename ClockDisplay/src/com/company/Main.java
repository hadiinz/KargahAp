package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ClockDisplay clockDisplay=new ClockDisplay();
        System.out.println(clockDisplay.getTime());
        clockDisplay=new ClockDisplay(5,7,11);
        System.out.println(clockDisplay.getTime());
    }
}
