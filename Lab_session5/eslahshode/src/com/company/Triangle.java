package com.company;

/**
 * triangle
 */
public class Triangle extends Polygon{

    /**
     * constractor
     * @param sides1
     */
    public Triangle(int... sides1){
        super();
        for (Integer i:sides1
        ) {
            sides.add(i);
        }

    }

    /**
     * if the triangle is equiteral return true else false
     * @return
     */
    public Boolean isEquilateral(){

            if ((sides.get(0).equals(sides.get(1)))&&sides.get(0).equals(sides.get(2)))return true;
            else return false;
    }

    /***
     * calculate area of triangle
     */
    @Override
    public void calculateArea() {
        area=(Math.sqrt(Math.abs(((double) peremeter/2)*(((double)peremeter/2)-(double)sides.get(0))
                *(((double)peremeter /2)-(double)sides.get(1))*(((double)peremeter/2)-(double)sides.get(2)))));

        super.calculateArea();
    }

    /**
     * calculate perimeter of triangle
     */
    @Override
    public void calculatePerimeter() {

        double sum=0;

        for (Integer i:sides
        ) {
            sum+=i;
        }peremeter=sum;
        super.calculatePerimeter();
    }

    /**
     * draw triangle or print area & premetr
     */
    @Override
    public void draw() {
        super.draw();
        calculateArea();
        calculatePerimeter();
        System.out.println("Triangle   "+"area="+area+"    premeter="+peremeter);
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
