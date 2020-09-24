package edu.itstudy.JAVA09.pattern.abstractfactory;

public class IEngineDomesticImpl implements IEngine{

    @Override
    public void run() {
        System.out.println("国内引擎");
    }
}
