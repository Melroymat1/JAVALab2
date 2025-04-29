class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String n, int a, int id) {
        super(n, a);
        employeeId = id;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + employeeId);
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Employee e = new Employee("John", 30, 101);
        e.display();
    }
}
