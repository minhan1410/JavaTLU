import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class DataJson {

    public static List<Peson> ReadFile(String address){
        Gson gson=new Gson();
        List<Peson> arrayList=new ArrayList<>();
        FileReader fileReader=null;
        try{
            fileReader=new FileReader(address);
            arrayList= new Gson().fromJson(fileReader, new TypeToken<List<Peson>>() {}.getType());
//            return arrayList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }


}
