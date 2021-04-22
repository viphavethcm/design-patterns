package StrategyPatterns;

public class QuarterDiscountStrategy implements PromoteStrategy {
    @Override
    public double DoDiscount(double price) {
        return price*0.75;
    }
}
