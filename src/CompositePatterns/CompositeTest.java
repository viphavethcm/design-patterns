package CompositePatterns;

import java.util.Arrays;
import java.util.List;

public class CompositeTest {
    /**
     *Lợi ích:
     * Cung cấp cùng một cách sử dụng đối với từng đối tượng riêng lẻ hoặc nhóm các đối tượng với nhau.
     *Sử dụng khi:
     * Composite Pattern chỉ nên được áp dụng khi nhóm đối tượng phải hoạt động như một đối tượng duy nhất (theo cùng một cách).
     * Composite Pattern có thể được sử dụng để tạo ra một cấu trúc giống như cấu trúc cây.
     */
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 2", 5);
        FileComponent file3 = new FileLeaf("file 3", 12);

        List<FileComponent> files = Arrays.asList(file1, file2, file3);
        FileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());
    }
}
