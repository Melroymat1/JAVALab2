class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Cashier extends Employee {
    int registerNumber;

    Cashier(String name, int id, int regNum) {
        super(name, id);
        registerNumber = regNum;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Register: " + registerNumber);
    }
}

public class CashierTest {
    public static void main(String[] args) {
        new Cashier("Ravi", 101, 12).display();
    }
}
