package com.company;

import java.util.ArrayList;

/**
 * paint & draw shapes
 */
public class Paint {
    private ArrayList<Shape>shapes=new ArrayList<>();

    /**
     * constractor
     */
    public Paint(){
        shapes=new ArrayList<>();
    }

    /**
     * add shape to array
     * @param shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
        
    }

    /**
     * draw all shapes area and peremeter
     */
    public void drawAll(){
        for (Shape s:shapes
             ) {
            s.draw();
            
        }
    }

    /**
     * print all sides or radius of shapes
     */
    public void printAll(){
        for (Shape s:shapes
             ) {
            System.out.println(s.toString());
        }
    }
}
