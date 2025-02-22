package ex3;

import java.util.stream.IntStream;

public class Exercise3 {
    public static void main(String[] args){
        IntStream average = IntStream.of(4, 5, 21, 13, 2);

        Double obj = average.average().getAsDouble();

        System.out.print(obj);

    }
}
