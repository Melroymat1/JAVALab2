class Person {
    String name = "Parent";
}

class Employee extends Person {
    String name = "Child";

    void showNames() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + name);
    }
}

public class NameTest {
    public static void main(String[] args) {
        new Employee().showNames();
    }
}
