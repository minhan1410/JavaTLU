package sample.Time;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.DataFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller{
    @FXML
    private Button button;
    @FXML
    private TextField text;


    public void ShowTime(ActionEvent event){
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss.SSSS <--> dd-mm-yyy");
        String stringDate=dateFormat.format(date);
        text.setText(stringDate);
    }
}


