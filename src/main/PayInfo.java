package main;
import java.util.*;

public class PayInfo {
  private int EmployeeID;
  private String FullName;
  private String Department;
  private int Salary;

    @Override
    public String toString() {
        return "PayInfo{" +
                "EmployeeID=" + EmployeeID +
                ", FullName='" + FullName + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public PayInfo(int employeeID, String fullName, String department, int salary) {
        EmployeeID = employeeID;
        FullName = fullName;
        Department = department;
        Salary = salary;
    }


    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

}
