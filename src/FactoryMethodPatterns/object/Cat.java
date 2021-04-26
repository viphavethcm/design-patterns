package FactoryMethodPatterns.object;

import FactoryMethodPatterns.IAnimal;

public class Cat implements IAnimal {
    @Override
    public String getName() {
        return "Cat";
    }
}
