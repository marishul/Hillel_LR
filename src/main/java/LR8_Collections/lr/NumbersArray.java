package LR8_Collections.lr;

import java.util.ArrayList;
import java.util.List;

public class NumbersArray {
    public static void main(String[] args) {

        List<Integer> intArray = new ArrayList<>(); //adding the number
        for (int i = 1; i <= 5; i++) {
            intArray.add(i);
        }

        for (Integer item : intArray) {   //print every item in numbers array collection
            System.out.println(item);
        }

        intArray.remove(2); // because index start from 0!

        System.out.println(intArray.toString());
    }
}
