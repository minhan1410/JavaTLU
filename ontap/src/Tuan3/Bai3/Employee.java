package Tuan3.Bai3;

import java.text.DecimalFormat;

public abstract class Employee {
    private String name;
    private double salary;

    private String pattern = "###,###VNĐ";
    private DecimalFormat formatTienTe = new DecimalFormat(pattern);

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double CountSalary();

    public double getSalary() {
        salary = CountSalary();
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + formatTienTe.format(getSalary()) + "\n";
    }

}