package sample.NhanVien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
	@FXML
	private ObservableList<NhanVien> NV;
	
	private List<NhanVien> nv=new ArrayList<NhanVien>();
	Alert alert=new Alert(Alert.AlertType.INFORMATION);
	
	@FXML
	private ResourceBundle resources;
	
	@FXML
	private URL location;
	
	@FXML
	private TextField MA;
	
	@FXML
	private TextField TEN;

	@FXML
	void Add(ActionEvent event) {
		String m=MA.getText();
		String t=TEN.getText();
		NhanVien a=new NhanVien();
		a.Add(m,t,nv.size()+1);nv.add(a);
		alert.setContentText("Luu xg");
		alert.show();
		
		list.add(a);
	}
	
	@FXML
	void Show(ActionEvent event) {
		StringBuffer string=new StringBuffer();
		for(int i=0;i<nv.size();i++){
			string.append(nv.get(i).toString());

		}
		alert.setContentText(string.toString());
		alert.show();
	}
	
	@FXML
	void initialize() {
		assert MA != null : "fx:id=\"MA\" was not injected: check your FXML file 'sample.fxml'.";
		assert tMA != null : "fx:id=\"tMA\" was not injected: check your FXML file 'sample.fxml'.";
		assert TEN != null : "fx:id=\"TEN\" was not injected: check your FXML file 'sample.fxml'.";
		assert tTEN != null : "fx:id=\"tTEN\" was not injected: check your FXML file 'sample.fxml'.";
		assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'sample.fxml'.";
		assert tID != null : "fx:id=\"tID\" was not injected: check your FXML file 'sample.fxml'.";
	}
	
	@FXML
	private TableView<NhanVien> table=new TableView<>();
	private TableColumn<NhanVien, String> tMA=new TableColumn<>();
	private TableColumn<NhanVien, String> tTEN=new TableColumn<>();
	private TableColumn<NhanVien, String> tID=new TableColumn<>();
	
	private  ObservableList<NhanVien> list;
	
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		list=FXCollections.observableArrayList(
			new NhanVien("1","1",1),
			new NhanVien("2","2",2)
		);
		
		tMA.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("MA"));
		tTEN.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("TEN"));
		tID.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("ID"));
		table.setItems(list);
		System.out.println(list);
	}
}
