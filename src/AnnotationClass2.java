public class AnnotationClass2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.animalAlwaysHuntsAndEats();

        Demo demo = (message) -> System.out.println("Message: " + message);
        demo.disp("Hello, world!");
    }
}

@FunctionalInterface
interface Demo {
    void disp(String message);
}

class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void animalAlwaysHuntsAndEats() {
        System.out.println("The animal always hunts and eats.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger is eating.");
    }

    @Override
    public void animalAlwaysHuntsAndEats() {
        System.out.println("The tiger always hunts and eats.");
    }
}