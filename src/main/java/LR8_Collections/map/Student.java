package LR8_Collections.map;

public class Student {

    String name = "";
    String passport = "";

    public Student(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "name: " + name + ", passport No.: " + passport + "\n";
    }
}
