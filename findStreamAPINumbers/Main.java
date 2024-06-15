package findStreamAPINumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Homework homework = new Homework();
        List<Employee> employeeList = new ArrayList<>();

        Homework.fillingEmployeesList(employeeList);

        System.out.println("The youngest employee is: ");
        System.out.println(Homework.findYoungestEmployee(employeeList));

        System.out.println("The department with the most salaried employee is: ");
        System.out.println(Homework.findMostSalariedInDepartment(employeeList));

        System.out.println("Employees breakdown by departments: ");
        System.out.println(Homework.groupByDepartment(employeeList));

        System.out.println("Breakdown by departments titles: ");
        System.out.println(Homework.groupByDepartmentName(employeeList));

        System.out.println("The oldest employee is: ");
        System.out.println(Homework.findDepartmentOldestEmployee(employeeList));

        System.out.println("The employee with the lowest salary is: ");
        System.out.println(Homework.lowSalariedEmployeeInDepartment(employeeList));
    }
}