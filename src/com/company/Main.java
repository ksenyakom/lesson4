package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box box1 = new Box();
        box1.depth =3;
        box1.width = 4;
        box1.height = 5;
        box1.color = BoxColor.RED;

        Box box2 = new Box(3,4,5,BoxColor.BLUE);

        int boxVolume = box1.volume();
        System.out.println(boxVolume);
        box2.printVolume();

        System.out.println(box1==box2);
        System.out.println(box1.color);
        System.out.println(box2.color);


    }
}
