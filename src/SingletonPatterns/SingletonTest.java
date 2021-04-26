package SingletonPatterns;

public class SingletonTest {
    /**
     *
     * Sử dụng khi:
     * Đảm bảo rằng chỉ có một instance của lớp.
     * Việc quản lý việc truy cập tốt hơn vì chỉ có một thể hiện duy nhất.
     * Có thể quản lý số lượng thể hiện của một lớp trong giớn hạn chỉ định.
     * Vì class dùng Singleton chỉ tồn tại 1 Instance (thể hiện) nên nó thường được dùng cho các trường hợp
     * giải quyết các bài toán cần truy cập vào các ứng dụng như: Shared resource, Logger, Configuration, Caching, Thread pool, …
     * Một số design pattern khác cũng sử dụng Singleton để triển khai: Abstract Factory, Builder, Prototype, Facade,…
     * Đã được sử dụng trong một số class của core java như: java.lang.Runtime, java.awt.Desktop.
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> DuySingleton.getInstance().sayHi());
        Thread thread2 = new Thread(() -> DuySingleton.getInstance().sayHi());
        thread1.start();
        thread2.start();
    }

}
