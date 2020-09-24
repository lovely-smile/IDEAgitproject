package edu.itstudy.JAVA09.pattern.statickproxy;

public class ProxyHouse implements IHouse{
    //被代理的对象
    private IHouse house;

    public  ProxyHouse(){}

    public ProxyHouse(IHouse house){
        this.house = house;
    }
    /**
     * 根据指定的客户去找房子
     */
    @Override
    public void findhouse() {
        System.out.println("before:房子系统中要查找满足你需求的房源");
        house.findhouse();
        System.out.println("After:");
    }
}
