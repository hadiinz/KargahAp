package com.company;

public class File {
    String address;
    String dateOfPropagatio;
    String nameOfSinger;

    public File(){};

    /**
     * constractor
     * @param address
     * @param dateOfPropagatio
     * @param nameOfSinger
     */
    public File (String address,String dateOfPropagatio,String nameOfSinger){
        this.dateOfPropagatio=dateOfPropagatio;
        this.address=address;
        this.nameOfSinger=nameOfSinger;

    }

    /**
     * print one file that wanted
     */
    public void  printFile(){
        System.out.println("name of song:"+address);
        System.out.println("singer:"+nameOfSinger);
        System.out.println("date of propagatin:"+dateOfPropagatio);
        System.out.println();
    }

    /**
     *
     * @return address
     */
    public String getAddress(){
        return address;
    }

    /**
     * return singer
     * @return
     */
    public String getNameOfSinger(){
        return nameOfSinger;
    }



}
