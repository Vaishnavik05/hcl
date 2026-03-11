class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;
    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Employee constructor called");
    }
    void displayEmployee() {
        displayPerson();
        System.out.println("Salary: " + salary);
    }
}
public class Salary {
    public static void main(String[] args) {
        Employee emp = new Employee("Vaishnavik", 21, 50000);
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployee();
    }
}