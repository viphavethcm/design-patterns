package FactoryMethodPatterns;

public abstract class AbstractAnimalFactory implements IAnimalFactory {

    @Override
    public abstract IAnimal createAnimal();
}
