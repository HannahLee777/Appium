package lession_08_lab08_01;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {


    public int totalSalary(List<Employee> employeeList){
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public List<Employee> employees(List<Employee> employeeList){
        int noFte = 3;
        int noContractor = 2;
        Employee fte = new FTE();
        Employee contractor = new Contractor();


            for (int i = 1; i <= noFte; i++) {
                employeeList.add(fte);
            }


            for (int i = 1; i <= noContractor; i++) {
                employeeList.add(contractor);
            }
        return employeeList;
    }

    public static void main(String[] args) {

        List<Employee> employeeList= new EmployeeController().employees(new ArrayList<>());

        System.out.println("total salary: " + new EmployeeController().totalSalary(employeeList));


    }

}
