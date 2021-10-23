package Tuan3.Bai3;

public class EmployeeFullTime extends Employee {
    private int NumberOfDay;

    public EmployeeFullTime(String name, double salary, int numberOfDay) {
        super(name, salary);
        NumberOfDay = numberOfDay;
    }

    public EmployeeFullTime(int numberOfDay) {
        this("", 0, numberOfDay);
    }

    public EmployeeFullTime() {
        this(0);
    }

    public int getNumberOfDay() {
        return NumberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        NumberOfDay = numberOfDay;
    }

    @Override
    public double CountSalary() {
        return NumberOfDay * 500_000;
    }
}
