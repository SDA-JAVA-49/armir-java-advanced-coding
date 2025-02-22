package ex4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Course", "sDa", "java");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.print("\nUppercase words: " + uppercaseWords);
    }
}
