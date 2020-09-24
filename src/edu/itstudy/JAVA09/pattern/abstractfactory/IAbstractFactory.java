package edu.itstudy.JAVA09.pattern.abstractfactory;

public interface IAbstractFactory {

        /**
         *获取一个完整产品的不同产品族
         */
        public IEngine getEngine();

        public IColor getColor();
}
