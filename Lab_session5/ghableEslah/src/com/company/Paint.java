package com.company;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Rectangle>rectangles=new ArrayList<>();
    private ArrayList<Circle>circles=new ArrayList<>();
    private ArrayList<Triangle>triangles=new ArrayList<>();

    public void addTriangle(Triangle t1){
        triangles.add(t1);

    }
    public void addCircle(Circle circle){
        circles.add(circle);
    }
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public void drawAll(){
        for (Rectangle r:rectangles
             ) {
            r.draw();
        }
        for (Triangle t:triangles
             ) {
            t.draw();

            }
        for (Circle c:circles
             ) {
            c.draw();
        }

    }

    public void printAll(){
        for (Rectangle r:rectangles
        ) {
            r.toString();
        }
        for (Triangle t:triangles
        ) {
            t.toString();

        }
        for (Circle c:circles
        ) {
            c.toString();
        }
    }





}
