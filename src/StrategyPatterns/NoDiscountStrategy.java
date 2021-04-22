package StrategyPatterns;

public class NoDiscountStrategy implements PromoteStrategy {
    @Override
    public double DoDiscount(double price) {
        return price;
    }
}
