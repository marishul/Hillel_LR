package LR7_Object;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("animal");
        System.out.println(animal.toString() + "\n");
        System.out.println("\nFor dogs:");
        Animal dog = new Dog("LR7_Object.Dog", "Sharik", 5);
        System.out.println(dog.toString());
        dog.say();
        System.out.println("\nFor cats:");
        Animal cat = new Cat("LR7_Object.Cat", "Barsik", 15);
        System.out.println(cat.toString());
        cat.say();
    }
}
