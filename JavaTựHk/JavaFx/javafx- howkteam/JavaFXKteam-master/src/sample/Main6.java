package sample;

public class Main6 {
    public static void main(String[] args) {
        MyNumber example = new MyNumber();
        example.numberProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(oldValue);
            System.out.println(newValue);
        });
        example.setNumber(10);
        example.setNumber(11);
    }
}
