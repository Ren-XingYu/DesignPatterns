package x.y.dps.creational.builder;

/**
 * 指导者，指导使用生成器的接口来构建产品的对象
 */
public class Director {
    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导生成器构建最终的产品对象
     */
    public void construct(){
        builder.buildPart();
    }
}
