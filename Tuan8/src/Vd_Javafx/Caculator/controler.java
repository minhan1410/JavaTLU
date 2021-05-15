package Vd_Javafx.Caculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class controler implements Initializable {
    @FXML
    private TextField txtB;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtKQ;

    @FXML
    private TableColumn<?, ?> tableLS;

    @FXML
    private TableView<String> table=new TableView<String>();

    private ObservableList<String> studentList;


    Boolean Check(String a){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)<48 || a.charAt(i)>57){
                return false;
            }
        }
        return true;
    }

    @FXML
    void Sum(ActionEvent event) {
        if(Check(txtA.getText())==false || Check(txtB.getText())==false){
            txtKQ.setText(txtA.getText()+" + "+txtB.getText());
            stringList.add(txtKQ.getText());
        }
        else{
            double kq=0;
            kq=Double.parseDouble(txtA.getText())+Double.parseDouble(txtB.getText());
            txtKQ.setText(kq+"");
            stringList.add(txtKQ.getText());
        }
    }

    @FXML
    void Tru(ActionEvent event) {
        if(Check(txtA.getText())==false || Check(txtB.getText())==false){
            txtKQ.setText(txtA.getText()+" - "+txtB.getText());stringList.add(txtKQ.getText());
        }
        else{
            double kq=0;
            kq=Double.parseDouble(txtA.getText())-Double.parseDouble(txtB.getText());
            txtKQ.setText(kq+"");stringList.add(txtKQ.getText());
        }
    }


    @FXML
    void Nhan(ActionEvent event) {
        if(Check(txtA.getText())==false || Check(txtB.getText())==false){
            txtKQ.setText(txtA.getText()+" x "+txtB.getText());stringList.add(txtKQ.getText());
        }
        else{
            double kq=0;
            kq=Double.parseDouble(txtA.getText())*Double.parseDouble(txtB.getText());
            txtKQ.setText(kq+"");stringList.add(txtKQ.getText());
        }
    }


    @FXML
    void Chia(ActionEvent event) {
        if(Check(txtA.getText())==false || Check(txtB.getText())==false){
            txtKQ.setText(txtA.getText()+" : "+txtB.getText());stringList.add(txtKQ.getText());
        }
        else{
            double kq=0;
            kq=Double.parseDouble(txtA.getText())/Double.parseDouble(txtB.getText());
            txtKQ.setText(kq+"");stringList.add(txtKQ.getText());
        }
    }

    private ObservableList<String> stringList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableLS.setCellValueFactory(new PropertyValueFactory<>(""));
        table.setItems(stringList);
    }
}
