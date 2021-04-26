package StrategyPatterns;

public class StrategyTest {

    /**
     * Sử dụng khi:
     * Khi muốn có thể thay đổi các thuật toán được sử dụng bên trong một đối tượng tại thời điểm run-time.
     * Khi có một đoạn mã dễ thay đổi, và muốn tách chúng ra khỏi chương trình chính để dễ dàng bảo trì.
     * Tránh sự rắc rối, khi phải hiện thực một chức năng nào đó qua quá nhiều lớp con.
     * Cần che dấu sự phức tạp, cấu trúc bên trong của thuật toán.
     * +Ý nghĩa thực sự của Strategy Pattern là giúp tách rời phần xử lý một chức năng cụ thể ra khỏi đối tượng.
     * Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và lựa chọn thuật toán nào mà chúng ta thấy đúng đắn nhất khi thực thi chương trình.
     * Mẫu thiết kế này thường được sử dụng để thay thế cho sự kế thừa, khi muốn chấm dứt việc theo dõi và chỉnh sửa một chức năng qua nhiều lớp con.
     */

    public static void main(String[] args) {
        for (int i = 0;i < 5;++i){
            Ticket ticket = new Ticket();
            ticket.setPrice(i+1);
            ticket.setName("ticket "+i);
            if ((i&1) != 1){
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
            }else {
                ticket.setPromoteStrategy(new NoDiscountStrategy());
            }
            System.out.println("Promoted of ticket "+ i +" is " +ticket.getPromotedPrice() +
                    " with Discount Type is "+ticket.getPromoteStrategy().getClass().toString());
        }
    }
}
