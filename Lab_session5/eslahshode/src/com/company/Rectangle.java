package com.company;

/**
 * extends from polygon that extends shape
 */
public class Rectangle extends Polygon{


    /**
     * constractor
     * @param side
     */
    public Rectangle(int... side){
        super();
        for (Integer i:side){
            sides.add(i);
        }
    }


    /**
     * draw
     */
    @Override
    public void draw() {
        super.draw();
        calculateArea();
        calculatePerimeter();
        System.out.println("Rectangle   "+"area="+area+"    premeter="+peremeter);
    }

    @Override
    public void calculateArea() {

        area=sides.get(0)*sides.get(1);
        super.calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        double sum=0;

        for (Integer i:sides
        ) {
            sum+=i;
        }peremeter=sum;

         super.calculatePerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
