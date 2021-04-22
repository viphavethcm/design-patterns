package StrategyPatterns;

public class Ticket {

    private double price;
    private String name;
    private PromoteStrategy promoteStrategy;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public Ticket(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public Ticket(){}

    public double getPromotedPrice(){
        return promoteStrategy.DoDiscount(price);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", promoteStrategy=" + promoteStrategy +
                '}';
    }
}
