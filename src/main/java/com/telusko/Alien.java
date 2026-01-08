package com.telusko;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien(int age, Laptop lap){
        System.out.println("parameterised constructor called ");
        this.age = age;
        this.lap = lap;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }
    public Alien(){

        System.out.println("Object Created");
    }
    public void code(){
        System.out.println("Coding");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
