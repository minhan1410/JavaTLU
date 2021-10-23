package Tuan5;

interface Caculator{
    int Sum(int a,int b);
}

public class Main {
    public static void main(String[] args) {
        Caculator caculator=(a,b)-> a+b;
        System.out.println(caculator.Sum(3,4));
    }
}
