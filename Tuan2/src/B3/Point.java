package B3;

public class Point {
    private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double KhoangCach() {
        return Math.sqrt(x * x + y * y);
    }

    public double KhoangCach(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double KhoangCach(Point a) {
        return Math.sqrt(Math.pow(this.x - a.getX(), 2) + Math.pow(this.y - a.getY(), 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String In() {
        return "( " + x + "," + y + " )";
    }

    public static void main(String[] args) {
        Point a = new Point(1,2);
        System.out.println("A"+a.In());

        System.out.println("Kc vs O(0,0): "+a.KhoangCach()+"\n");

        System.out.println("Kc vs 2 tham so: "+a.KhoangCach(3,4)+"\n");

        System.out.println("Kc vs Point: "+a.KhoangCach(new Point(2,6)));
    }
}
