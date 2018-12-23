package x.y.dps.behavioral.templatemethod;

public abstract class AbstractClass {
    /**
     * 原语操作1，所谓原语操作就是抽象的操作，必须要由子类提供实现
     */
    abstract void doPrimitiveOperation1();

    /**
     * 原语操作2
     */
    abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void  templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }


}
