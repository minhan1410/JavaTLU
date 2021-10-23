package sample.NhanVien;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	@FXML
	private TableView<NhanVien> table;
	@FXML
	private TableColumn<NhanVien,Integer> tId;
	@FXML
	private TableColumn<NhanVien,String> tTen;
	@FXML
	private  TableColumn<NhanVien,String> tMa;
	
	
	@FXML
	private TextField TextMa;
	
	@FXML
	private TextField TextId;
	
	@FXML
	private TextField TextTen;
	
	private ObservableList<NhanVien> ListNhanVien;
	
	private Alert alert=new Alert(Alert.AlertType.INFORMATION);
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		ListNhanVien= FXCollections.observableArrayList();
		tId.setCellValueFactory(new PropertyValueFactory<NhanVien,Integer>("id"));
		tMa.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("Ma"));
		tTen.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("Ten"));
		table.setItems(ListNhanVien);
	}
	
	@FXML
	public void Add(ActionEvent event){
		NhanVien a=new NhanVien();
		a.Add(TextTen.getText(),TextMa.getText(),Integer.parseInt(TextId.getText()));
		ListNhanVien.add(a);
	}
	
	@FXML
	public void Delete (ActionEvent e){
		NhanVien select = table.getSelectionModel().getSelectedItem();
		ListNhanVien.remove(select);
	}
	
	@FXML
	public void Sua (ActionEvent e){
		alert.setContentText("Vui long chon vt can sua va nhap gt muon sua");
		alert.show();
		
		NhanVien a=new NhanVien();
		a.Add(TextTen.getText(),TextMa.getText(),Integer.parseInt(TextId.getText()));
		
		NhanVien select = table.getSelectionModel().getSelectedItem();
		int vt=0;
		for(int i=0;i<ListNhanVien.size();i++){
			if(select.getId() == ListNhanVien.get(i).getId()){
				vt=i;
			}
		}
		ListNhanVien.set(vt,a);
	}
	
	@FXML
	public void Loc(ActionEvent event){
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<ListNhanVien.size();i++){
			if(ListNhanVien.get(i).getId()>5){
				stringBuffer.append(ListNhanVien.get(i));
			}
		}
		alert.setContentText("Nhan vien co id>5\n"+stringBuffer.toString());
		alert.show();
	}
}
