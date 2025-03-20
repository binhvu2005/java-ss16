import java.util.ArrayList;
import java.util.List;

public class Bai2 {
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

        System.out.println("danh sánh trước khi xóa");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("danh sách còn lại sau khi xóa:");
        numbers.removeIf(number -> number % 3 == 0);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
