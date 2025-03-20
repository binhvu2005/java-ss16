import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Bai3 {
    public static void main(String[] args) {
            List <Integer> number = new ArrayList<>();
            number.add(1);
            number.add(2);
            number.add(3);
            number.add(4);
            number.add(5);
            number.add(6);
            number.add(7);
            number.add(8);
            number.add(9);
            number.add(10);

        System.out.println("số lớn nhất: " + number.stream().max(Integer::compareTo).get());
        System.out.println("số bé nhất: " + number.stream().min(Integer::compareTo).get());
    }
}
