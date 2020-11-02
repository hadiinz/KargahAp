package com.company;

import java.util.ArrayList;

public class Triangle {
    private ArrayList<Integer>sides=new ArrayList<>();

    public Triangle(int... sides1){
        for (Integer s:sides1
             ) {
            sides.add(s);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public Boolean isEquilateral(){
        if ((sides.get(0).equals(sides.get(1)))&&sides.get(0).equals(sides.get(2)))return true;
        else return false;
    }
    public int calculatePerimeter(){
        int sum=0;
        for (Integer i:sides
             ) {
            sum+=i;
        }return sum;
    }

    public double calculateArea(){
        double area;
        area=(Math.sqrt(calculatePerimeter()*(calculatePerimeter()-sides.get(0))
        *(calculatePerimeter()-sides.get(1))*(calculatePerimeter()-sides.get(2))));
        return  area;
    }
    public void draw(){
        System.out.println("Triangle   "+"area="+calculateArea()+"    premeter="+calculatePerimeter()
        );
    }

    public Boolean equals(Triangle t1){
        return  equals1(t1.sides.get(0),t1.sides.get(1),t1.sides.get(2));
    }
    public Boolean equals1(int a,int b,int c){
        int flag=0;
        for (Integer i:sides
             ) {
            if (i.equals(a)){
                for (Integer ii:sides
                     ) {
                    if (ii.equals(b)){
                        for (Integer iii:sides
                             ) {
                            if (iii.equals(c))flag=1;
                        }
                    }
                }
            }
        }
        if (flag==0)return false;
        else return true;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
