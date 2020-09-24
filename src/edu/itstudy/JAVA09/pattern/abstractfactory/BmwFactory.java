package edu.itstudy.JAVA09.pattern.abstractfactory;

public class BmwFactory implements IAbstractFactory{
    /**
     *根据父工厂来创建各自的子工厂
     *  子工厂中可以根据产品族来构建各自的产品等级
     *      通过产品等级来组成一个产品
     */
    @Override
    public IColor getColor() {
        return new IColorBlueImpl();
    }

    @Override
    public IEngine getEngine() {
        return new IEngineDomesticImpl();
    }
}
