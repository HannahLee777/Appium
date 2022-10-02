package lession_07;

public class Employee {
    private String employeeType;
    private int salary;

    public Employee(String employeeType, int salary) {
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public int getSalary() {
        return salary;
    }
}
