
import java.io.Serializable;

class EmployeeBean implements Serializable {
    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        EmployeeBean e = new EmployeeBean();

        e.setEmpId(101);
        e.setEmpName("Rahul");
        e.setSalary(35000);

        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
        System.out.println("Salary: " + e.getSalary());
    }
}
