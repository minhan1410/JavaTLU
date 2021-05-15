package Vd_Javafx.VD;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class cotroler_Sample {
    @FXML
    private TextField txt;

    @FXML
    void Show(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("TextField: "+txt.getText());
        alert.show();
    }

    @FXML
    void Open(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Stage stage =new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
