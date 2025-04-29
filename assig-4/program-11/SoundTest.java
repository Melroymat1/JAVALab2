class Animal {
    void makeSound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void makeSound() { System.out.println("Dog barks"); }
}

class Cat extends Animal {
    void makeSound() { System.out.println("Cat meows"); }
}

public class SoundTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();
    }
}
