package OOP;

public class Fish extends Animal implements Flyable,Swimable{
    String type;

    public Fish(int age, String kilo, String type) {
        super(age, kilo);
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void fly() {

    }
}
