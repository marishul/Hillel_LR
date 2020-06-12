public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("animal");
        System.out.println(animal.toString() + "\n");
        System.out.println("\nFor dogs:");
        Animal dog = new Dog("Dog", "Sharik", 5);
        System.out.println(dog.toString());
        dog.say();
        System.out.println("\nFor cats:");
        Animal cat = new Cat("Cat", "Barsik", 15);
        System.out.println(cat.toString());
        cat.say();
    }
}
