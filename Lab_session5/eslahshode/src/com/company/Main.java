package com.company;

/**
 * the example of shapes and run methods
 * @author Hadi Nazemi
 */
public class Main {

    public static void main(String[] args) {
	// write your code here


            Shape circle1 = new Circle(19);
           Shape circle2 = new Circle(3);
            Shape rect1 = new Rectangle(1,4,1,4);
           Shape rect2 = new Rectangle(8,5,8,5);
            Rectangle rec3 = new Rectangle(6,6,6,6);
            Triangle tri1 = new Triangle(2,2,2);
            Triangle tri2 = new Triangle(4,4,6);
            Paint paint = new Paint();
            paint.addShape(circle1);
            paint.addShape(circle2);
            paint.addShape(rec3);
            paint.addShape(rect1);
            paint.addShape(rect2);
            paint.addShape(tri1);
            paint.addShape(tri2);
            paint.drawAll();
            paint.printAll();

        }


}
