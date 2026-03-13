import java.util.Deque;
import java.util.ArrayDeque;
public class StackDq {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack elements: " + stack); 
        stack.pop();
        System.out.println("after pop: " + stack);
    }
}