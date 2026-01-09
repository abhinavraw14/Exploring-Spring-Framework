package com.telusko;

public class Alien {

    private int age;
    private Computer com;

    public Alien(){
        System.out.println("Object created");
    }

//    public Alien(int age, Computer com){
//        System.out.println("parameterised constructor called ");
//        this.age = age;
//        this.lap = lap;
//    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
