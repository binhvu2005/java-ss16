
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử trong mảng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            numbers.add(sc.nextInt());
        }

        // Đếm số lần xuất hiện của từng phần tử
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // In kết quả
        System.out.println("Số lần xuất hiện của từng phần tử:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }

        sc.close();
    }
}
