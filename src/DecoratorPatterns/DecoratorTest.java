package DecoratorPatterns;
import DecoratorPatterns.Decorators.BlackSugar;
import DecoratorPatterns.Decorators.Bubble;

public class DecoratorTest {

    public static void main(String[] args) {
        IMilkTea milkTeaWithBubble = new Bubble(new MilkTea());
        IMilkTea milTeaWithBlackSugar = new BlackSugar(new MilkTea());
        IMilkTea milkTeaWithBubbleAndBlackSugar = new Bubble(new BlackSugar(new MilkTea()));
        System.out.println("Tra sua tran chau:"+milkTeaWithBubble.cost());
        System.out.println("Tra sua duong den:"+milTeaWithBlackSugar.cost());
        System.out.println("Tra sua tran chau duong den:"+milkTeaWithBubbleAndBlackSugar.cost());
    }
}
