package edu.itstudy.JAVA07.extendss;

public class Cat extends Animal{

    String name = "cat";

    public Cat(){
        super();
        System.out.println("---cat---");
    }
    public void sleep(){
        System.out.println("---cat的sleep方法");
    }

    public void info(){
        System.out.println(name+"\t"+super.name);
    }
}
