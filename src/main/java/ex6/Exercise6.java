package ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args){
        List<Integer> oddOrEven = Arrays.asList(3, 6, 72, 21, 31, 2);
        System.out.println(formatNumbers(oddOrEven));
    }

    public static String formatNumbers(List<Integer> numbers){
        return numbers.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.joining(","));
    }
}
