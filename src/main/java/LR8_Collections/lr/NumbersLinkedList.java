package LR8_Collections.lr;
import java.util.List;
import java.util.LinkedList;

public class NumbersLinkedList {
    public static void main(String[] args) {
        List <Integer> intList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            intList.add(i);
        }
        intList.add(1); //duplicates can be added

        for (Object item: intList) {
            System.out.println(item);
        }

        intList.remove(2);

        System.out.println(intList.toString());
    }
}
