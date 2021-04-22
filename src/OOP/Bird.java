package OOP;

public class Bird extends Animal implements Flyable{
    boolean hasSwing;

    public Bird(int age, String kilo, boolean hasSwing) {
        super(age, kilo);
        this.hasSwing = hasSwing;
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
