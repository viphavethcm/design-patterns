package FactoryMethodPatterns.object;

import FactoryMethodPatterns.IAnimal;

public class Dog implements IAnimal {
    @Override
    public String getName() {
        return "Dog";
    }
}
