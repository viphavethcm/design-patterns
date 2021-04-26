package FactoryMethodPatterns;

import java.util.Random;

public class FactoryMethodTest {
    /**
     * Ví dụ: Tất cả hệ thống ngân hàng có cung cấp API để truy cập đến hệ thống của họ.
     * Team được giao nhiệm vụ thiết kế một API để client có thể sử dụng dịch vụ của một ngân hàng bất kỳ.
     * Hiện tại, phía client chỉ cần sử dụng dịch vụ của 2 ngân hàng là VietcomBank và TPBank.
     * Tuy nhiên để dễ mở rộng sau này, và phía client mong muốn không cần phải thay đổi code của họ khi cần sử dụng thêm dịch vụ của ngân hàng khác.
     * Với yêu cầu như vậy, chúng ta có thể sử dụng một Pattern phù hợp là Factory Method Pattern.
     *Sử dụng khi nào:
     * Chúng ta có một super class với nhiều class con và dựa trên đầu vào, chúng ta cần trả về một class con.
     * Mô hình này giúp chúng ta đưa trách nhiệm của việc khởi tạo một lớp từ phía người dùng (client) sang lớp Factory.
     * Chúng ta không biết sau này sẽ cần đến những lớp con nào nữa.
     * Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc khởi tạo sub class này.
     */

    public static void main(String[] args) {
        //Factory Method
//        IAnimalFactory factory;
//
//        Random random = new Random();
//        int type = random.nextInt(2);
//        if (type == 0)
//            factory = new BasicAnimalFactory();
//        else
//            factory = new RandomAnimalFactory();
//
//        System.out.println(factory.createAnimal().getName());
//        System.out.println(factory.createAnimal().getName());
//        System.out.println(factory.createAnimal().getName());
//        System.out.println(factory.createAnimal().getName());
//        System.out.println(factory.createAnimal().getName());

        //Abstract Factory
        IAnimalFactory factory;

        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0)
            factory = new TwoLegsAnimalFactory();
        else
            factory = new RandomAnimalFactory();

        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());


    }
}
