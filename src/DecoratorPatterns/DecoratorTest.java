package DecoratorPatterns;
import DecoratorPatterns.Decorators.BlackSugar;
import DecoratorPatterns.Decorators.Bubble;

public class DecoratorTest {
    /**
     * Lợi ích:
     * Tăng cường khả năng mở rộng của đối tượng, bởi vì những thay đổi được thực hiện bằng cách implement trên các lớp mới.
     * Client sẽ không nhận thấy sự khác biệt khi bạn đưa cho nó một wrapper thay vì đối tượng gốc.
     * Một đối tượng có thể được bao bọc bởi nhiều wrapper cùng một lúc.
     * Cho phép thêm hoặc xóa tính năng của một đối tượng lúc thực thi (run-time).
     * Sử dụng khi:
     * +Khi muốn thêm tính năng mới cho các đối tượng mà không ảnh hưởng đến các đối tượng này.
     * +Khi không thể mở rộng một đối tượng bằng cách thừa kế (inheritance).
     * Chẳng hạn, một class sử dụng từ khóa final, muốn mở rộng class này chỉ còn cách duy nhất là sử dụng decorator.
     * +Trong một số nhiều trường hợp mà việc sử dụng kế thừa sẽ mất nhiều công sức trong việc viết code.
     * Ví dụ trên là một trong những trường hợp như vậy.
     */

    public static void main(String[] args) {
        IMilkTea milkTeaWithBubble = new Bubble(new MilkTea());
        IMilkTea milTeaWithBlackSugar = new BlackSugar(new MilkTea());
        IMilkTea milkTeaWithBubbleAndBlackSugar = new Bubble(new BlackSugar(new MilkTea()));
        System.out.println("Tra sua tran chau:"+milkTeaWithBubble.cost());
        System.out.println("Tra sua duong den:"+milTeaWithBlackSugar.cost());
        System.out.println("Tra sua tran chau duong den:"+milkTeaWithBubbleAndBlackSugar.cost());
    }
}
