package CommandPatterns;

public class CommandTest {
    /**
     *
     * Đôi khi chúng ta cần gửi các yêu cầu cho các đối tượng mà không biết bất cứ điều gì về hoạt động được yêu cầu hoặc người nhận yêu cầu.
     * Chẳng hạn chúng có một ứng dụng văn bản, khi click lên button undo/ redo, save, … yêu cầu sẽ được chuyển đến hệ thống xử lý,
     * chúng ta sẽ không thể biết được đối tượng nào sẽ nhận xử lý, cách nó thực hiện như thế nào.
     * Command Pattern là một Pattern được thiết kế cho những ứng dụng như vậy.
     * Ví dụ:
     * Một hệ thống ngân hàng cung cấp ứng dụng cho khách hàng (client) có thể mở (open) hoặc đóng (close) tài khoản trực tuyến.
     * Hệ thống này được thiết kế theo dạng module, mỗi module sẽ thực hiện một nhiệm vụ riêng của nó, chẳng hạn mở tài khoản (OpenAccount),
     * đóng tài khoản (CloseAccount). Do hệ thống không biết mỗi module sẽ làm gì, nên khi có yêu cầu client (chẳng hạn clickOpenAccount,
     * clickCloseAccount), nó sẽ đóng gói yêu cầu này và gọi module xử lý.
     * Sử dụng khi:
     * Khi cần tham số hóa các đối tượng theo một hành động thực hiện.
     * Khi cần tạo và thực thi các yêu cầu vào các thời điểm khác nhau.
     * Khi cần hỗ trợ tính năng undo, log , callback hoặc transaction.
     */
    public static void main(String[] args) {
        Fan fan = new Fan();
        ICommand turnOnCommand = new TurnOnCommand(fan);
        ICommand turnOfCommand = new TurnOffCommand(fan);
        Remote remote = new Remote(turnOnCommand,turnOfCommand);
        remote.turnOnButton();
        remote.turnOffButton();
    }
}
