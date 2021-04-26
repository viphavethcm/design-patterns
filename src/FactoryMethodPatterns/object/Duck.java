package FactoryMethodPatterns.object;

import FactoryMethodPatterns.IAnimal;

public class Duck extends TwoLegsAnimal {
    @Override
    public String getName() {
        return "Duck";
    }
}
