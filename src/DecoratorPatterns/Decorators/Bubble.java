package DecoratorPatterns.Decorators;

import DecoratorPatterns.IMilkTea;
import DecoratorPatterns.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1 + super.cost();
    }
}
