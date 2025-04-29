class Example {
    static int a = 10;
    int b = 20;

    static void show() {
        Example e = new Example();
        System.out.println("a: " + a + ", b: " + e.b);
    }
}

public class StaticAccess {
    public static void main(String[] args) {
        Example.show();
    }
}
