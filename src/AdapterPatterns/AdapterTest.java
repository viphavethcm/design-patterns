package AdapterPatterns;


public class AdapterTest {
    /**
     *
     * Một người Việt muốn trao đổi với một người Nhật.
     * Tuy nhiên, 2 người này không biết ngôn ngữ của nhau nên cần phải có một người để chuyển đổi từ ngôn ngữ tiếng Việt sang ngôn ngữ tiếng Nhật.
     * Sử dụng khi:
     * 1)Adapter Pattern giúp nhiều lớp có thể làm việc với nhau dễ dàng mà bình thường không thể.
     * Một trường hợp thường gặp phải và có thể áp dụng Adapter Pattern là khi không thể kế thừa lớp A,
     * nhưng muốn một lớp B có những xử lý tương tự như lớp A. Khi đó chúng ta có thể cài đặt B theo Object Adapter,
     * các xử lý của B sẽ gọi những xử lý của A khi cần.
     * 2)Khi muốn sử dụng một lớp đã tồn tại trước đó nhưng interface sử dụng không phù hợp như mong muốn.
     * 3)Khi muốn tạo ra những lớp có khả năng sử dụng lại, chúng phối hợp với các lớp không liên quan hay những lớp không thể đoán trước được và những lớp này không có những interface tương thích.
     * 4)Cần phải có sự chuyển đổi interface từ nhiều nguồn khác nhau.
     * 5)Khi cần đảm bảo nguyên tắc Open/ Close trong một ứng dụng.
     */
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
