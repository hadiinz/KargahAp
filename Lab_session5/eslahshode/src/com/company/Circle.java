package com.company;

/**
 * extonds from shape
 */
public class Circle extends Shape{
    private int radius;

    /**
     * constractor
     * @param radius
     */
    public Circle(int radius){
        super();
        this.radius=radius;
    }

    /**
     *
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /***
     * calculate perimeter of circle
     */
    @Override
    public void calculatePerimeter() {
        peremeter= 2*Math.PI*radius;
        super.calculatePerimeter();
    }

    /**
     * calculate area of circle
     */
    @Override
    public void calculateArea() {
        area=Math.PI*radius*radius;
        super.calculateArea();
    }

    /**
     * draw circle or print area and premeter
     */
    @Override
    public void draw() {
        super.draw();
      calculateArea();
      calculatePerimeter();
            System.out.println("Circle   area="+area+"    premeter="+peremeter);


    }

    /**
     * return string of circle
     * radius
     * @return
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
