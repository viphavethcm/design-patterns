package DecoratorPatterns;

public abstract class MilkTeaDecorator implements IMilkTea{
    private IMilkTea iMilkTea;
    public MilkTeaDecorator(IMilkTea inner){
        iMilkTea = inner;
    }

    @Override
    public double cost() {
        return iMilkTea.cost();
    }
}
