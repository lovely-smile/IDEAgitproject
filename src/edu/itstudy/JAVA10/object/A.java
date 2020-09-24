package edu.itstudy.JAVA10.object;

public class A extends Object{
    private String name = "张三";
    private int age = 10;
    private String sex = "男";

    public void A(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String toString(){
        return "name="+this.name;
    }
}
