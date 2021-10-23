package VD;

import java.util.ArrayList;

public class Main implements MyInterface{
    
    @Override
    public int getValue() {
        return 8;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int i=1; i<=5;i++){
            arrayList.add(i);
        }

        for(int i=0; i<arrayList.size();i++){
            arrayList.remove(i);
        }
    }
}
