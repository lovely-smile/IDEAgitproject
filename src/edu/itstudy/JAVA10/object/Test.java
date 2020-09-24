package edu.itstudy.JAVA10.object;

public class Test {

    public static void main(String[] args) {
        /*
        Object类默认是所有类的直接或间接的父类
        Object可以以多态的思想接受每一个类的对象

        object方法：
        ①getClass:返回运行时的实际类
        ②toString方法：
                当直接输出一个对象时，就会自动调用当前对象的toString方法(object中)
                edu.itstudy.JAVA10.object.B@2f4d3709

         */
     Object obj = new Test();
     B b = new B();
     Class c = obj.getClass();
     System.out.println(c.getName());

     A a = new B();
        System.out.println(a.getClass().getName());

        System.out.println(a);
     A a1 = new A();
        System.out.println(a1.getName()+"\t"+a1.getAge());
        System.out.println(a1);

    }
}
