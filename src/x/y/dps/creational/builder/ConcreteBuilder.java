package x.y.dps.creational.builder;

/**
 * 具体的生成器对象
 */
public class ConcreteBuilder implements Builder {
    /**
     * 生成器最终构建的产品对象
     */
    private Product resultProduct;

    /**
     * 获取生成器构建的产品对象
     * @return
     */
    public Product getResultProduct() {
        return resultProduct;
    }

    @Override
    public void buildPartA() {
        //构建某个部件的功能处理
        System.out.println("buildPart...A");
    }

    @Override
    public void buildPartB() {
        System.out.println("buildPart...B");
    }
}
