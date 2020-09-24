package edu.itstudy.JAVA07.extendss;

public class Animal {
    String name = "动物";
    int age;
    private int size;

    public Animal(){
        System.out.println("---Animal---");
    }
    public void eat(){
        System.out.println("---eat()---");
    }
    public void sleep(){
        System.out.println("---晚上睡觉---");
    }
}
