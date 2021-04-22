package OOP;

public class Chicken extends Bird implements Flyable{

    public Chicken(int age, String kilo, boolean hasSwing) {
        super(age, kilo, hasSwing);
    }

    @Override
    public void fly() {
        System.out.println("Chicken not able to fly");
    }
}
