package lession_07;

public class CalculateEmployeeSalary {
    private static int NO_PER = 3;
    public static int NO_CONTRACTOR = 2;
    public static void main(String[] args) {
        Employee employeePer = new Employee("permanent", 50000);
        Employee employeeContractor = new Employee("contractor", 40000);

        int totalSalary = NO_PER*employeePer.getSalary() + NO_CONTRACTOR*employeeContractor.getSalary();
        System.out.println("Total salary: " + totalSalary);
    }
}
