package lambda.sec04;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends,(o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);        
    }
}
