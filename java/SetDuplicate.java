import java.util.Set;
import java.util.HashSet;
public class SetDuplicate {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); 
        numbers.add(10);
        System.out.println("Set contents: " + numbers);
        System.out.println("Size of set: " + numbers.size());
    }
}