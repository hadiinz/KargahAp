package com.company;

import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Integer> sides=new ArrayList<>();

    public Rectangle(int... sides1){
        for (Integer s:sides1
        ) {
            sides.add(s);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public Boolean isSquare(){
        if ((sides.get(0).equals(sides.get(1)))&&sides.get(0).equals(sides.get(2))&&sides.get(0).equals(sides.get(3)))return true;
        else return false;
    }
    public int calculatePerimeter(){
        int sum=0;
        for (Integer i:sides
        ) {
            sum+=i;
        }return sum;
    }

    public  int     calculateArea(){
        int area=  sides.get(0)*sides.get(1);
        return area;
    }

    public void draw(){
        System.out.println("Rectangle   "+"area="+calculateArea()+"    premeter="+calculatePerimeter()
        );
    }
    public Boolean equals(Rectangle r1){
        return equals1(r1.sides.get(0),r1.sides.get(1),r1.sides.get(2),r1.sides.get(3));
    }
    public Boolean equals1(int a,int b,int c,int d){
        int flag=0;
        for (Integer i:sides
        ) {
            if (i.equals(a)){
                for (Integer ii:sides
                ) {
                    if (ii.equals(b)){
                        for (Integer iii:sides
                        ) {
                            if (iii.equals(c)){
                                for (Integer iiii:sides
                                     ) {
                                    if (iiii.equals(d))flag=1;
                                }
                            }
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
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
