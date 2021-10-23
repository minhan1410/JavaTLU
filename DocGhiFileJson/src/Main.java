import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        DataJson.ReadFile("src\\data.json").forEach(peson -> System.out.println(peson));
    }
}
