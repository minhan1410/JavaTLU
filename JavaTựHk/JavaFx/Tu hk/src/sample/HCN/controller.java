package sample.HCN;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class controller {
    @FXML
    private TextField CD,CR;
    public void DienTich(ActionEvent e){
        float cd=Float.parseFloat(CD.getText());
        float cr=Float.parseFloat(CR.getText());
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("S= "+(cd*cr));
        alert.show();
    }
    public void VeHinh(ActionEvent e){
        int cd=Integer.parseInt(CD.getText());
        int cr=Integer.parseInt(CR.getText());
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        StringBuffer string=new StringBuffer("");
        for(int i=1;i<=cd;i++){
            for(int j=1;j<=cr;j++){
                string.append("* ");
            }
            string.append("\n");
        }
        alert.setContentText(string.toString());
        alert.show();
    }
}
