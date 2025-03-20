
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Bai6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử trong mảng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            numbers.add(sc.nextInt());
        }

        // Loại bỏ các phần tử trùng lặp nhưng giữ nguyên thứ tự xuất hiện đầu tiên
        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        // In kết quả
        System.out.println("Danh sách sau khi loại bỏ các phần tử trùng lặp:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (seen.add(num)) { // Chỉ thêm phần tử nếu nó chưa xuất hiện
                result.add(num);
            }
        }
        return result;
    }
}
