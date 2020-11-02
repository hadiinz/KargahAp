package com.company;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }
    public double calculatePerimeter(){
        double sum=0;
        sum=2*Math.PI*radius;
        return sum;
    }

    public  double     calculateArea(){
        double area=  Math.PI*radius*radius;
        return area;
    }
    public void draw(){
        System.out.println("Circle   "+"area="+calculateArea()+"    premeter="+calculatePerimeter()
        );
    }
    public Boolean equals(Circle c){
        if (c.radius==radius)return true;
        else return false;
    }

}
