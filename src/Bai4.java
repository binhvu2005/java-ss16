import java.util.ArrayList;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        int total = 0;

        for (Integer i : numbers) {
            total += i;
        }
        System.out.println("tổng các phần tủ trong mảng:"+total);
    }
}
