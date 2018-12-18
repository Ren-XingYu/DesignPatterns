package x.y.dps.behavioral.strategy;

public class PriceContext {
    private Strategy strategy=null;

    public PriceContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice){
        return this.strategy.calcPrice(goodsPrice);
    }
}
