package FactoryMethodPatterns;

import FactoryMethodPatterns.object.Cat;
import FactoryMethodPatterns.object.Dog;
import FactoryMethodPatterns.object.Duck;

public class BasicAnimalFactory implements IAnimalFactory{

    int idx = 0;

    @Override
    public IAnimal createAnimal() {
        if (idx == 0){
            idx++;
            return new Dog();
        }else if (idx == 1){
            idx++;
            return new Cat();
        }else if (idx == 2){
            idx = 0;
            return new Duck();
        }
        return null;
    }

}
