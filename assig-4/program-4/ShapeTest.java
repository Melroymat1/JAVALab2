abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r = 3;
    double area() { return Math.PI * r * r; }
}

class Rectangle extends Shape {
    double l = 4, w = 5;
    double area() { return l * w; }
}

 class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
