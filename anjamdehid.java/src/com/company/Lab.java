package com.company;

/**
 * this clas is lab
 * and az tedadi daneshjo tashkil shode
 *
 */

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private  int currentSize;

    /**
     *
     * @param cap capaciti of lab
     * @param d day of lab
     */
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        avg=0;
        students=new Student[capacity];
        currentSize=0;

    }

    /**
     *
     * @param std enroll student to lab
     */

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print kardane daneshjo haye class
     *
     */
    public void print() {
 // System.out.println(currentSize)      ;
        for(int i=0;i<currentSize;i++){
            students[i].print();

        } System.out.println(avg);
    }


    public Student[] getStudents() {
    return students;
    }

    public void setStudents(Student[] students) {
        this.students=students;

    }

    /**
     *
     * @return meghdare miangine class ra barmigardaanad
     */
    public int getAvg() {

        return  avg;
    }


    public void calculateAvg() {
        double sum=0.0;
        for(int i=0;i<currentSize;i++)sum+=students[i].getGrade();
        avg=(int) (sum/currentSize);
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day=day;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }


}