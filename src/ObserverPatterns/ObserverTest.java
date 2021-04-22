package ObserverPatterns;

public class ObserverTest {
    /**
     * Thực tế:Cập nhật và gửi thông báo đến những người theo dõi
     **/
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
