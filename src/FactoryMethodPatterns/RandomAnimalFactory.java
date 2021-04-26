package FactoryMethodPatterns;

import FactoryMethodPatterns.object.Cat;
import FactoryMethodPatterns.object.Chicken;
import FactoryMethodPatterns.object.Dog;
import FactoryMethodPatterns.object.Duck;

import java.util.Random;

public class RandomAnimalFactory implements IAnimalFactory{

    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0)
            return new Chicken();
        else
            return new Duck();
    }
}
