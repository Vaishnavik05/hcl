import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List<String> students = new java.util.ArrayList<>();
        students.add("Rahul");
        students.add("Anita");
        students.add("John");
        students.add("Priya");
        students.add("David");
        System.out.println("All students: {" + String.join(", ", students) + "}");
        System.out.println("Student at index 2: " + students.get(2));
    }
}