package BuilderPatterns;

public interface IUserBuilder {
    IUserBuilder addName(String name);
    IUserBuilder addAge(int age);
    IUserBuilder addAddress(Address address);

    User build();
}
