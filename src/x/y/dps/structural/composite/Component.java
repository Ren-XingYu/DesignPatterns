package x.y.dps.structural.composite;

/**
 * 抽象的组合对象，为组合中的对象声明接口，实现接口的缺省行为
 */
public abstract class Component {
    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    abstract void someOperation();

    /**
     * 向组合对象加入组件对象
     * @param child 被加入的组件对象
     */
    public void  addChild(Component child){
        //缺省的实现，抛出例外，因为叶子功能没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移除某个组件对象
     * @param child 被移除的组件镀锡
     */
    public void removeChild(Component child){
        //缺省的实现，抛出例外，因为叶子功能没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 返回某个索引对象的组件对象
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对象的组件对象s
     */
    public Component getChildren(int index){
        //缺省的实现，抛出例外，因为叶子功能没有这个功能
        // 或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

}
