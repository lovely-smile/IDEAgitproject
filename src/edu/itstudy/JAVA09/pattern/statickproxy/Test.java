package edu.itstudy.JAVA09.pattern.statickproxy;

public class Test {

    public static void main(String[] args) {
        //创建一个被代理类
        IHouse zhangsan = new IHouseZhangsanImpl();
        /*
         *找到中介公司（代理类）
         *      需要告知
         */
        ProxyHouse ph = new ProxyHouse(zhangsan);
        ph.findhouse();
    }
}
