package x.y.dps.structural.proxy;

/**
 * 代理对象
 */
public class Proxy implements Subject {
    /**
     * 持有被代理的目标对象
     */
    private Subject subject=null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象之前，可以执行一些功能处理

        //转调具体的目标对象的方法
        subject.request();

        //在转调具体的目标对象之后，可以执行一些功能处理
    }
}
