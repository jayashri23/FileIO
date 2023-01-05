package fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollDataList;
    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollDataList){
        this.employeePayrollDataList =employeePayrollDataList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollDataArrayList =new ArrayList<>();
        EmployeePayrollService employeePayrollService =new EmployeePayrollService(employeePayrollDataArrayList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner consoleInputReader){
        System.out.println("Enter employee id :");
        int id =consoleInputReader.nextInt();
        System.out.println("Enter employee name :");
         String name =consoleInputReader.next();
        System.out.println("Enter employee salary :");
        double salary = consoleInputReader.nextDouble();
        employeePayrollDataList.add(new EmployeePayrollData(id,name,salary));
    }

    private  void writeEmployeePayrollData(){
        System.out.println("\nWriting employee payroll roaster to console\n " + employeePayrollDataList);
    }
}
