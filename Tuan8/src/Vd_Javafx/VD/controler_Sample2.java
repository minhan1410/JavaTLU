package Vd_Javafx.VD;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class controler_Sample2 {
    @FXML
    private Button b_click;

    @FXML
    public void Click(javafx.event.ActionEvent event) {
        Stage stage=(Stage) b_click.getScene().getWindow();
        stage.close();
    }
}
