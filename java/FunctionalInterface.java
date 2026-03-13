@java.lang.FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        System.out.println(add.operation(10,20));
        System.out.println(sub.operation(10, 15));
        System.out.println(mul.operation(10, 25));
        System.out.println(div.operation(6, 5));
    }
}