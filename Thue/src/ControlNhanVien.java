package src;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LongStringConverter;

public class ControlNhanVien implements Initializable {
    @FXML
    private TableColumn<NhanVien, Integer> tableTuoi;

    @FXML
    private TextField textID;

    @FXML
    private TextField textTongLg;

    @FXML
    private TextField textNamSinh;

    @FXML
    private TableColumn<NhanVien,String> tableID;

    @FXML
    private TextField textTen;

    @FXML
    private TableView<NhanVien> table;

    @FXML
    private TableColumn<NhanVien, String> tableTen;

    @FXML
    private TableColumn<NhanVien, Long> tableTongLg;

    private Set<NhanVien> setNhanVien=new LinkedHashSet<NhanVien>();

    //ObservableList: Một danh sách cho phép người nghe theo dõi các thay đổi khi chúng xảy ra
    private ObservableList<NhanVien> listNhanVien;

    private static long TongThuNhap=0;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listNhanVien= FXCollections.observableArrayList();

        tableID.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("id"));
        tableTen.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("ten"));
        tableTuoi.setCellValueFactory(new PropertyValueFactory<NhanVien,Integer>("tuoi"));
        tableTongLg.setCellValueFactory(new PropertyValueFactory<NhanVien,Long>("TongThuNhap"));


        table.setItems(listNhanVien);
    }

    @FXML
    void Nhap(){
        try{
            String id=textID.getText();
            String ten=textTen.getText();
            int NamSinh=Integer.parseInt(textNamSinh.getText());
            long TongLg=Long.parseLong(textTongLg.getText());

            NhanVien v=new NhanVien(id,ten,NamSinh,TongLg);

            if(!setNhanVien.contains(v)){
                setNhanVien.add(v);
                listNhanVien.add(v);
            }
            else{
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Lỗi");
                alert.setContentText("Id đã trùng");
                alert.show();
            }
        }catch (Exception exception){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setContentText(exception.getLocalizedMessage());
            alert.show();
        }
    }

    @FXML
    void Sua(ActionEvent e){
        table.setEditable(true);

        tableID.setCellFactory(TextFieldTableCell.<NhanVien> forTableColumn());
        tableTen.setCellFactory(TextFieldTableCell.<NhanVien> forTableColumn());
        tableTuoi.setCellFactory(TextFieldTableCell.<NhanVien, Integer>forTableColumn(new IntegerStringConverter()));
        tableTongLg.setCellFactory(TextFieldTableCell.<NhanVien, Long>forTableColumn(new LongStringConverter()));


        tableID.setOnEditCommit((TableColumn.CellEditEvent<NhanVien, String> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<NhanVien, String> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            String newCMTND = event.getNewValue();

            NhanVien v = event.getTableView().getItems().get(pos.getRow());

            String oldCMTND=v.getId();v.setId(newCMTND);

            if(setNhanVien.contains(v)){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Lỗi");
                alert.setContentText("Id đã trùng");
                alert.show();
                v.setId(oldCMTND);
            }
            else{
                v.setId(newCMTND);
            }
        });

        tableTen.setOnEditCommit((TableColumn.CellEditEvent<NhanVien, String> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<NhanVien, String> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            String newTen = event.getNewValue();
            int row = pos.getRow();
            NhanVien v = event.getTableView().getItems().get(row);
            v.setTen(newTen);
        });

        tableTongLg.setOnEditCommit((TableColumn.CellEditEvent<NhanVien, Long> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<NhanVien, Long> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            Long newTongLg = event.getNewValue();
            int row = pos.getRow();
            NhanVien v = event.getTableView().getItems().get(row);
            v.setTongThuNhap(newTongLg);
        });
    }

    long  LayLuong(){
        return TongThuNhap;
    }

    @FXML
    void Thue(ActionEvent e) throws IOException {
        try{
            NhanVien selected = table.getSelectionModel().getSelectedItem();
            TongThuNhap=selected.getTongThuNhap();

            Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage stage =new Stage();
            stage.setTitle("Tính thuế thu nhập cá nhân");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception exception){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setContentText(exception.toString());
            alert.show();
        }
    }
}

