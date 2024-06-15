package findStreamAPINumbers;

public class Employee {
    private String employeeName;
    private int employeeAge;
    private double employeeSalary;
    private Department employeeDepartment;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Department getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        // System.out.printf(" %20s, %7s, %8s, %8s, %s", " Name", "Age", "Salary",
        // "Department", "\n");
        return String.format(" %20s, %7s, %8s, %11s, %s", employeeName, String.valueOf(employeeAge),
                String.valueOf(employeeSalary), employeeDepartment.getDepartmentName(), "\n");
    }

    public static String[] getTestNamesList() {
        String[] testNamesList = { "Victoria Pak", "Ahmed Badi", "Nika Podrich",
                "Peter Khan", "Liv Tiler", "Lena Pokoleno", "Archi Bulb",
                "Misha Galustyan", "Harry Potter", "Kate Smith",
                "The one with no name", "Khleb Vorobiev", "Grisha Kurwitz" };
        return testNamesList;
    }

}