package DecoratorPatterns.Decorators;

import DecoratorPatterns.IMilkTea;
import DecoratorPatterns.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }
}
