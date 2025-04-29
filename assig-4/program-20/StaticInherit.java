class Parent {
    static void show() { System.out.println("Static from Parent"); }
}

class Child extends Parent {}

public class StaticInherit {
    public static void main(String[] args) {
        Parent.show();
        Child.show();
    }
}
