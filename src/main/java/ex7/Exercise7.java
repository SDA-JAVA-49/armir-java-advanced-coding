package ex7;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Exercise7 {
    public static void main (String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("H400102170R", "Jack Smith", 23000),
                new Employee("K092345729Z", "John Doe", 45000),
                new Employee("H623454687A", "Jessie Doe", 30500)
        );
        Employee salary = employees.stream()
                .filter(s -> s.getSalary() >= 30000)
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There is no employee found with salary lower than 30000"));

        System.out.println("First eligible employee found: " + salary);

    }
}
