package StrategyPatterns;

public class StrategyTest {

    public static void main(String[] args) {
        for (int i = 0;i < 5;++i){
            Ticket ticket = new Ticket();
            ticket.setPrice(i+1);
            ticket.setName("ticket "+i);
            if ((i&1) != 1){
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
            }else {
                ticket.setPromoteStrategy(new NoDiscountStrategy());
            }
            System.out.println("Promoted of ticket "+ i +" is " +ticket.getPromotedPrice() +
                    " with Discount Type is "+ticket.getPromoteStrategy().getClass().toString());
        }
    }
}
