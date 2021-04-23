package BuilderPatterns;

public class UserBuilder implements IUserBuilder{

    private String name;
    private int age;
    private Address address;

    @Override
    public IUserBuilder addName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IUserBuilder addAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IUserBuilder addAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public User build() {
        return new User(name,age,address);
    }
}
