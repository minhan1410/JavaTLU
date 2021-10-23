package sample.Test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
	@FXML
	private TableView<NV> table;
	@FXML
	private TableColumn<NV,Integer> tId;
	@FXML
	private TableColumn<NV,String> tTen;
	@FXML
	private TableColumn<NV,String> tMa;
	
	private ObservableList<NV> ListNV;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ListNV = FXCollections.observableArrayList(
				new NV("Chau", "chau@gmail.com", 21),
				new NV("Chuong", "chuong@gmail.com", 20)
		);
		tId.setCellValueFactory(new PropertyValueFactory<NV, Integer>("id"));
		tTen.setCellValueFactory(new PropertyValueFactory<NV, String>("Ten"));
		tMa.setCellValueFactory(new PropertyValueFactory<NV, String>("Ma"));
		table.setItems(ListNV);
	}
}
