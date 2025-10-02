package chadJavaIntroCourse.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithObj {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Simangele", 1));
        employees.add(new Employee(2, "Samukelo", 2));
        employees.add(new Employee(3, "Sipho", 3));
        employees.add(new Employee(4, "Bongani", 4));
        employees.add(new Employee(5, "Kabelo", 5));
        employees.add(new Employee(6, "Naledi", 6));
        employees.add(new Employee(7, "Nkhensani", 7));

        int employeeYearsAbove4 = 0;

        for (Employee employee : employees) {
            if (employee.getYearsOfService() > 4) {
                employeeYearsAbove4++;
            }
        }
        System.out.println("More than 4 is "+employeeYearsAbove4);

        long employeeYearsLessThan5 = employees.stream()
                .filter(e -> e.getYearsOfService() < 5)
                .count();
        System.out.println("Less than 5 is " + employeeYearsLessThan5);
        System.out.println("=====Starts with S====");

        List<Employee> startsWithS = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getFirstName().startsWith("S")) {
                startsWithS.add(employee);
            }
        }

        for (Employee employee : startsWithS) {
            System.out.println(employee.getFirstName());
        }

        System.out.println("=====Ends with O====");
        List<Employee> endsWithO = employees.stream().filter(e -> e.getFirstName().endsWith("o")).toList();
        endsWithO.forEach(e -> System.out.println(e.getFirstName()));

    }
}

