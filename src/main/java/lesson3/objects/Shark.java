package main.java.lesson3.objects;

public class Shark extends Animal{

    public Shark() {
        super();
    }

    public void sleep() {
        System.out.println(" I am NOT SLEEPPING ......");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.println("ssss");
    }

    @Override
    public void eat() {

    }
}
