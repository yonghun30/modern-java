package collection.sec03;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> badWords = new HashSet<>();
        badWords.add("sex");
        badWords.add("drugs");
        badWords.add("c++");
        badWords.add("c++");

        Scanner in = new Scanner(System.in);
        System.out.print("Please choose a user name: ");
        String username = in.next();        
        if (badWords.contains(username.toLowerCase()))
            System.out.println("Please choose a different user name");
        else
            System.out.println("Registered " + username + " since it wasn't one of " + badWords);
        
        TreeSet<String> countries = new TreeSet<>();
        
        countries.add("Bahrain");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Canada");
        System.out.println(countries);
    }
}
