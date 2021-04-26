package ObserverPatterns;

public class ObserverTest {
    /**
     * Giả sử hệ thống của chúng ta cần theo dõi về tài khoản của người dùng.
     * Mọi thao tác của người dùng đều cần được ghi log lại, sẽ thực hiện gửi mail thông báo khi tài khoản hết hạn,
     * thực hiện chặn người dùng nếu truy cập không hợp lệ, …
     * Sử dụng khi:
     * +Thường được sử dụng trong mối quan hệ 1-n giữa các object với nhau.
     * Trong đó một đối tượng thay đổi và muốn thông báo cho tất cả các object liên quan biết về sự thay đổi đó.
     * +Khi thay đổi một đối tượng, yêu cầu thay đổi đối tượng khác và chúng ta không biết có bao nhiêu đối tượng cần thay đổi,
     * những đối tượng này là ai.
     * Sử dụng trong ứng dụng broadcast-type communication.
     * Sử dụng để quản lý sự kiện (Event management).
     * +Sử dụng trong mẫu mô hình MVC (Model View Controller Pattern) : trong MVC, mẫu này được sử dụng để tách Model khỏi View.
     * View đại diện cho Observer và Model là đối tượng Observable.
     */
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        PhoneNotifier phoneNotifier = new PhoneNotifier(videoData);
        videoData.setTitle("Observer Design Pattern");
        videoData.setDesc("ABCDEF");
        videoData.setFileName("123456");
        EmailNotifier emailNotifier = new EmailNotifier(videoData);
        videoData.setFileName("789");

    }
}
