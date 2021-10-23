package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField td;

    @FXML
    private TableView<LaiXe> tLX;

    @FXML
    private TableColumn<LaiXe, String> tDC;

    @FXML
    private TableColumn<LaiXe, String> tTD;

    @FXML
    private TableColumn<LaiXe, Integer> tMa;

    @FXML
    private TextField ten;

    @FXML
    private TableColumn<LaiXe, String> tTen;

    @FXML
    private TextField dc;
    private ObservableList<LaiXe> lx;
    private Alert alert=new Alert(Alert.AlertType.INFORMATION);
    @FXML
    public void addLX(ActionEvent event) throws NullPointerException{
        lx.add(new LaiXe(ten.getText(),dc.getText(),td.getText()));
        System.out.println(lx.toString());
    }

    @FXML
    public void initialize() {
        lx= FXCollections.observableArrayList();
        tMa.setCellValueFactory(new PropertyValueFactory<LaiXe,Integer>("Ma"));
        tTen.setCellValueFactory(new PropertyValueFactory<LaiXe,String>("Ten"));
        tDC.setCellValueFactory(new PropertyValueFactory<LaiXe,String>("Dia chi"));
        tTD.setCellValueFactory(new PropertyValueFactory<LaiXe,String>("Trinh do"));

        tLX.setItems(lx);


    }
}
