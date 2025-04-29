class Animal {
    void makeSound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }
}

 class SuperTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
