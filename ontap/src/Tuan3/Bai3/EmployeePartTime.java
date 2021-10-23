package Tuan3.Bai3;

public class EmployeePartTime extends Employee {
    private int NumberOfTime;

    public EmployeePartTime(String name, double salary, int numberOfTime) {
        super(name, salary);
        this.NumberOfTime = numberOfTime;
    }

    public EmployeePartTime(int numberOfTime) {
        this("", 0, numberOfTime);
    }

    public EmployeePartTime() {
        this(0);
    }

    @Override
    public double CountSalary() {
        return NumberOfTime * 40_000;
    }

}
