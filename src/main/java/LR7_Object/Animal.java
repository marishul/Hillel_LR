package LR7_Object;

public class Animal {

    String type = "";
    String name = "";
    int age = 0;

    Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override //override the method of Object class
    public String toString() {
        return "I am LR7_Object.Animal";
    }

    public void say() {
    }
}
