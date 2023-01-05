package fileio;

public class EmployeePayrollData {
   public int empId;
   public String empName;
   public double empSalary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.empName =name;
        this.empId =id;
        this.empSalary=salary;
    }
    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + empSalary +
                '}';
    }
}
