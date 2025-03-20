import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<String> Students = new ArrayList<>();
        Students.add("John");
        Students.add("Jane");
        Students.add("Bob");
        Students.add("Mary");
        Students.add("Alex");
        System.out.println("dùng foreach:");
        for (String student : Students) {
            System.out.println(student);
        }
        System.out.println("dùng for thường:");
        for (int i = 0; i < Students.size(); i++) {
            System.out.println(Students.get(i));
        }
        System.out.println("dùng Iterator:");
        Iterator<String> iterator = Students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
