package ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main (String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("H400102170R", "Jack Smith", 23000),
                new Employee("K092345729Z", "John Doe", 45000),
                new Employee("H623454687A", "Jessie Doe", 30500)
        );

        int maxSalary = employees.stream()
                .mapToInt(Employee :: getSalary)
                .max()
                .orElseThrow(() -> new NoSuchElementException("No employees available"));

        List<Employee> sortByName = employees.stream()
                .sorted(Comparator.comparing(Employee :: getNames))
                .collect(Collectors.toList());

        Employee salary = employees.stream()
                .filter(s -> s.getSalary() >= 30000)
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There is no employee found with salary lower than 30000"));

        System.out.println("First eligible employee found: " + salary);
        System.out.println("Employees names sorted: " + sortByName);
        System.out.println("Maximum salary: " + maxSalary);

    }

}
