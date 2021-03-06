package BuilderPatterns;

import BuilderPatterns.Imutable.BankAccount;

public class BuilderTest {

    /**
     * Lợi ích:
     * +Tạo một đối tượng phức tạp: có nhiều thuộc tính (nhiều hơn 4) và một số bắt buộc (requried),
     * một số không bắt buộc (optional).
     * +Giảm bớt số lượng constructor, không cần truyền giá trị null cho các tham số không sử dụng.
     * +Ít bị lỗi do việc gán sai tham số khi mà có nhiều tham số trong constructor:
     * bởi vì người dùng đã biết được chính xác giá trị gì khi gọi phương thức tương ứng.
     * +Đối tượng được xây dựng an toàn hơn: bởi vì nó đã được tạo hoàn chỉnh trước khi sử dụng.
     * +Cung cấp cho bạn kiểm soát tốt hơn quá trình xây dựng: chúng ta có thể thêm xử lý
     * kiểm tra ràng buộc trước khi đối tượng được trả về người dùng.
     * Nhược điểm:
     * +Builder Pattern có nhược điểm là duplicate code khá nhiều:
     * do cần phải copy tất cả các thuộc tính từ class Product sang class Builder.
     * +Tăng độ phức tạp của code (tổng thể) do số lượng class tăng lên.
     * Sử dụng khi:
     * Tạo một đối tượng phức tạp: có nhiều thuộc tính (nhiều hơn 4) và một số bắt buộc (requried), một số không bắt buộc (optional).
     * Khi có quá nhiều hàm constructor, bạn nên nghĩ đến Builder.
     * Muốn tách rời quá trình xây dựng một đối tượng phức tạp từ các phần tạo nên đối tượng.
     * Muốn kiểm soát quá trình xây dựng.
     * Khi người dùng (client) mong đợi nhiều cách khác nhau cho đối tượng được xây dựng.
     */
    public static void main(String[] args) {
        User user = new UserBuilder()
                .addName("duy")
                .addAge(16)
                .build();
        System.out.println(user.toString());
        //Imutable
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("contact@gpcoder.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
