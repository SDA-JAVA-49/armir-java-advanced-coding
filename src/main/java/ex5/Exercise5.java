package ex5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args){
        List<String> withA = Arrays.asList("and", "automatic", "begin", "any");

        List<String> filteredWords = withA.stream()
                .filter(w -> w.toLowerCase().startsWith("a"))
                .filter(w -> w.length() == 3)
                .collect(Collectors.toList());

        System.out.print("\nFiltered words: " + filteredWords);
    }
}
