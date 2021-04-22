package OOP;

import OOP.Bird;
import OOP.Chicken;
import OOP.Fish;
import OOP.Flyable;

public class OOP_main {
    public static void main(String[] args) {

        Chicken chicken = new Chicken(1,"24",true);
        chicken.fly();
        Bird bird = new Bird(2,"25",true);
        bird.fly();
        System.out.println("-----------------------------------");
        Bird bird2 = new Bird(2,"25",true);
        bird2.move();
        Fish fish = new Fish(1,"24","ca heo");
        fish.move();
        System.out.println("-----------------------------------");
        Flyable flyingBird = new Bird(1,"24",true);
        flyingBird.fly();
    }
}
