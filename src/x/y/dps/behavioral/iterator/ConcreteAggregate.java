package x.y.dps.behavioral.iterator;

/**
 * 具体的聚合对象，实现创建相应迭代器对象的功能
 */
public class ConcreteAggregate implements Aggregate {
    /**
     * 示意，表示聚合对象具体的内容
     */
    private String[] ss=null;

    public ConcreteAggregate(String[] ss) {
        this.ss = ss;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index){
        Object retObj=null;
        if (index<ss.length){
            retObj=ss[index];
        }
        return retObj;
    }

    public int size(){
        return this.ss.length;
    }
}
