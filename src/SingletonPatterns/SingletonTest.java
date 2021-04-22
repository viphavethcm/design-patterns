package SingletonPatterns;

public class SingletonTest {

    /*Thực tế:Logging:Dùng để lưu lại lịch sử người dùng và hành vi người dùng(caching)
     *
     *
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> DuySingleton.getInstance().sayHi());
        Thread thread2 = new Thread(() -> DuySingleton.getInstance().sayHi());
        thread1.start();
        thread2.start();
    }

}
