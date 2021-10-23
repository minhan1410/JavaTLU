package Tuan3.Bai2;

public class Circle implements IHinh{
    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Acreage() {
        return Math.PI*radius*radius;
    }

    @Override
    public double Perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void PrintIHinh() {
        System.out.println("Chu vi: "+Perimeter()+"\nDiện tích: "+Acreage());
    }
    
}
