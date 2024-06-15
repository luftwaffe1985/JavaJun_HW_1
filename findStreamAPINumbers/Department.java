package findStreamAPINumbers;

public class Department {
    private String departmentName;

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String name) {
        this.departmentName = name;
    }

    public String[] getTestDepartmentsList() {
        String[] departments = { "Law", "Engineering", "IT", "Maintenance", "Finance" };
        return departments;
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + "]";
    }
}