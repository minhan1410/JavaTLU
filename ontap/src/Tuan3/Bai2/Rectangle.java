package Tuan3.Bai2;

public class Rectangle implements IHinh{
    private double width, height;

    public Rectangle() {
        this(0,0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double Acreage() {
        return width*height;
    }

    @Override
    public double Perimeter() {
        return (width+height)*2;
    }

    @Override
    public void PrintIHinh() {
        System.out.println("Chu vi: "+Perimeter());
        System.out.println("Diện tích: "+Acreage()); 
    }
    
}
