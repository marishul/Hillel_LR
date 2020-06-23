package LR8_Collections.lr;

import java.util.HashSet;
import java.util.Set;

public class NumbersHashSet {
    public static void main(String[] args) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int i = 1; i <=5 ; i++) {
            numbersSet.add(i);
        }

        numbersSet.add(5);  // duplicate is not added as 6 element!

        for (Integer item:numbersSet) {
            System.out.println(item);
        }

        numbersSet.remove(2);

        System.out.println(numbersSet.toString());
    }
}
