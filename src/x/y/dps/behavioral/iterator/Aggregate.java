package x.y.dps.behavioral.iterator;

/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 */
public interface Aggregate {
    Iterator createIterator();
}
