package lab;

import java.util.Date;

public class employee {

    private int departmentNo;
    private String name;
    private long id;
    private Date birthDate;
    private Date hireDate;
    private double basicSalary;

    public employee(int departmentNo, String name, long id, Date birthDate, Date hireDate, double basicSalary) {
        this.departmentNo = departmentNo;
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.basicSalary = basicSalary;
    }

    public void setDepartmentNo(int departmentNo) {
        this.departmentNo = departmentNo;
    }

    public int getDepartmentNo() {
        return departmentNo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void printEmployeeInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getBasicSalary());
        System.out.println("ID: " + this.getId());
        System.out.println("Hire Date: " + this.getHireDate());
        System.out.println("Birth Date: " + this.getBirthDate());
    }
}
