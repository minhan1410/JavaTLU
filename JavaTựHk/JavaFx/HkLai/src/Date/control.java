package Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.sql.Time;

import java.awt.*;
import java.util.Timer;

public class control {
    @FXML
    private javafx.scene.control.Button button;
    @FXML
    private TextField show;

    public void show(ActionEvent event){
        Time a=new Time(System.currentTimeMillis());

        show.setText(a.toString());
    }
}
