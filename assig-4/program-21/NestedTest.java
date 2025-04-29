class Outer {
    static class Nested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }
}

public class NestedTest {
    public static void main(String[] args) {
        Outer.Nested n = new Outer.Nested();
        n.display();
    }
}
