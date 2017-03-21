package collection.sec04;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> weekdays = new HashMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
        
        weekdays = new TreeMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
        
        weekdays = new LinkedHashMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
    }
    
    public static void initialize(Map<String, Integer> weekdays) {
        weekdays.put("Monday", 1);
        weekdays.put("Tuesday", 2);
        weekdays.put("Wednesday", 3);
        weekdays.put("Thursday", 4);
        weekdays.put("Friday", 5);
        weekdays.put("Saturday", 6);
        weekdays.put("Sunday", 7);
    }
}
