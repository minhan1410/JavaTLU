package sample.Time;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    @FXML
    private TextField Text;
    private Button Nhap;

    public void Time(ActionEvent event){
        System.out.println("Time");
        Date now= new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        String dateTimeString = df.format(now);
        Text.setText(dateTimeString);
    }
}
