package com.company;

public class Box {
    int width;
    int height;
    int depth;
    public BoxColor color;

    public Box() {

    }
    // конструктор
    public Box(int width, int height, int depth, BoxColor color){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }
    // метод
    public int volume() {return width*height*depth;}

    public double flexibleVolume(double divider){
        return width*divider*height*divider*depth*divider;
    }

    public void printVolume(){
        int volume = volume();
        System.out.println(volume);
    }

}
