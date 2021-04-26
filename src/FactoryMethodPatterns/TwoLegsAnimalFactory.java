package FactoryMethodPatterns;

import FactoryMethodPatterns.object.Cat;
import FactoryMethodPatterns.object.Dog;
import FactoryMethodPatterns.object.Duck;

import java.util.Random;

public class TwoLegsAnimalFactory extends AbstractAnimalFactory{
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(3);
        if (type == 0)
            return new Dog();
        else if (type == 1)
            return new Cat();
        else
            return new Duck();
    }
}
