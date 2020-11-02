package com.company;

import java.util.ArrayList;

/**
 * extends from shape
 * have sides
 * and methods
 */
public class Polygon extends Shape{
    public ArrayList<Integer>sides=new ArrayList<>();

    /**
     * constractor
     * @param sides1
     */
    public Polygon(int... sides1){
        for (Integer i:sides1
             ) {
            sides.add(i);
        }
    }

    /**
     * if it has eqyual sides return true
     * else false
     * @return
     */
    public Boolean describeEqualSides(){
        int flag=0;
        for (Integer i:sides
             ) {
            for (Integer j:sides
                 ) {
                if (!i.equals(j)){
                    flag=1;
                }
            }
        }
        if (flag==0)return  true;
        else return false;
    }


    /**
     *
     * @return array of sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of polygon
     */
    @Override
    public void calculatePerimeter() {

    }

    /**
     * calculate area of polygon
     */
    @Override
    public void     calculateArea(){


    }

    /**
     * draw or print area & premeter
     */
    @Override
    public void draw(){

        calculatePerimeter();
        calculateArea();
    }

    /**]
     *
     * @return string of name of tyoe and sides
     */
    @Override
    public String toString() {
        return "Polygon{" +
                "sides=" + sides +
                '}';
    }
}
