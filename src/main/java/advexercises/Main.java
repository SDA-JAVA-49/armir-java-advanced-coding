package advexercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = 0;

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }
        System.out.println("Reversed: " + reversed);

    }
}

