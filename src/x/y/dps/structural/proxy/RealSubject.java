package x.y.dps.structural.proxy;

public class RealSubject implements Subject {
    /**
     * 具体的目标对象，是真正被代理的对象
     */
    @Override
    public void request() {
        //执行具体的功能处理
    }
}
