package findStreamAPINumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Homework {
    List<Employee> employeeList = new ArrayList<>();

    public static void fillingEmployeesList(List<Employee> employeeList) {
        for (String item : Employee.getTestNamesList()) {
            Employee employee = new Employee();
            Department department = new Department();
            employee.setEmployeeName(item);
            employee.setEmployeeAge(ThreadLocalRandom.current().nextInt(19, 65));
            employee.setEmployeeSalary(ThreadLocalRandom.current().nextDouble(70_000, 400_000));
            department.setDepartmentName(department.getTestDepartmentsList()[ThreadLocalRandom.current()
                    .nextInt(department.getTestDepartmentsList().length)]);
            employee.setEmployeeDepartment(department);
            employeeList.add(employee);
        }
        System.out.println(employeeList);
    }

    static Optional<Employee> findYoungestEmployee(List<Employee> employees) { // Find the youngest one
        return employees.stream().min((o1, o2) -> Integer.compare(o1.getEmployeeAge(), o2.getEmployeeAge()));
    }

    static Optional<Department> findMostSalariedInDepartment(List<Employee> employees) { // Find the department where
                                                                                         // the
                                                                                         // most salaried employee works
        return employees.stream()
                .max((o1, o2) -> Double.compare(o1.getEmployeeSalary(), o2.getEmployeeSalary()))
                .map(b -> b.getEmployeeDepartment());
    }

    static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) { // Employees breakdown by
                                                                                         // departments
        return employees.stream()
                .collect(Collectors.groupingBy(it -> it.getEmployeeDepartment()));
    }

    static Map<String, List<Employee>> groupByDepartmentName(List<Employee> employees) { // Employees grouping by the
                                                                                         // department title
        return employees.stream()
                .collect(Collectors.groupingBy(it -> it.getEmployeeDepartment().getDepartmentName()));
    }

    static Map<String, Employee> findDepartmentOldestEmployee(List<Employee> employees) { // Find the oldest one in each
                                                                                          // department
        return employees.stream()
                .collect(Collectors.toMap(b -> b.getEmployeeDepartment().getDepartmentName(),
                        b -> b,
                        (a, b) -> {
                            if (a.getEmployeeAge() > b.getEmployeeAge()) {
                                return a;
                            }
                            return b;
                        }));
    }

    static List<Employee> lowSalariedEmployeeInDepartment(List<Employee> employees) { // Find the employees with the
                                                                                      // lowest
        // salaries in their departments
        Map<String, Employee> lowestSalariedEmployee = employees.stream()
                .collect(Collectors.toMap(b -> b.getEmployeeDepartment().getDepartmentName(),
                        b -> b,
                        (a, b) -> {
                            if (a.getEmployeeSalary() < b.getEmployeeSalary()) {
                                return a;
                            }
                            return b;
                        }));
        return lowestSalariedEmployee.values().stream()
                .collect(Collectors.toList());
    }
}
