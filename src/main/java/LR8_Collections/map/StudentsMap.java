package LR8_Collections.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentsMap {
    public static void main(String[] args) {
        Map <String, Student> students = new HashMap <>();
        students.put("student1", new Student("Alona", "TT678X"));
        students.put("student2", new Student("Mariia", "YYUT65"));
        students.put("student3", new Student("Petya", "FG3u755P"));

        System.out.println(students.toString());
    }
}