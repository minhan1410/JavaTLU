package src;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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
import javafx.scene.Node;
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
    private  TableColumn<NhanVien,Integer> tableNamSinh;

    @FXML
    private TableColumn<NhanVien, Long> tableTongLg;

    private Set<NhanVien> setNhanVien=new LinkedHashSet<NhanVien>();

    //ObservableList: Một danh sách cho phép người nghe theo dõi các thay đổi khi chúng xảy ra
    private ObservableList<NhanVien> listNhanVien;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listNhanVien= FXCollections.observableArrayList();

        tableID.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("id"));
        tableTen.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("ten"));
        tableNamSinh.setCellValueFactory(new PropertyValueFactory<NhanVien,Integer>("NamSinh"));
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
        tableNamSinh.setCellFactory(TextFieldTableCell.<NhanVien, Integer>forTableColumn(new IntegerStringConverter()));
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

            table.setEditable(false);
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

        tableNamSinh.setOnEditCommit((TableColumn.CellEditEvent<NhanVien, Integer> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<NhanVien, Integer> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            Integer newNamSinh = event.getNewValue();
            int row = pos.getRow();
            NhanVien v = event.getTableView().getItems().get(row);
            v.setNamSinh(newNamSinh);
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

    @FXML
    void Remove(ActionEvent event){
        NhanVien v=table.getSelectionModel().getSelectedItem();
        setNhanVien.remove(v);
        listNhanVien.remove(v);
    }

    @FXML
    void Thue(ActionEvent event) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("thue.fxml"));
            Parent root = loader.load();
            Control controller = loader.getController();
            NhanVien selected = table.getSelectionModel().getSelectedItem();
            controller.set(selected);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception exception){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setContentText(exception.toString());
            alert.show();
        }
    }

    @FXML
    void LuuFile(ActionEvent event) throws IOException {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Lưu file");
        alert.setHeaderText("Đang tiến hành lưu...");

        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;

        try {
            fileOutputStream=new FileOutputStream("D:\\Java\\JavaTLU\\Thue\\src\\NhanVien.txt");
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            for(int i=0;i<listNhanVien.size();i++){
                NhanVien v=listNhanVien.get(i);
                bufferedOutputStream.write((v.getId()+"-"+v.getTen()+"-"+v.getNamSinh()+"-"+v.getTongThuNhap()+"*").getBytes(StandardCharsets.UTF_8));
            }

            alert.setContentText("Lưu thành công");
        } catch (FileNotFoundException e) {
            alert.setContentText("Gặp lỗi");
        } finally {
            bufferedOutputStream.close();
            fileOutputStream.close();
            alert.show();
        }
    }

    @FXML
    void DocFile(ActionEvent event) throws IOException {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Đọc file");
        alert.setHeaderText("Đang tiến hành đọc...");

        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream=null;

        try{
            fileInputStream=new FileInputStream("D:\\Java\\JavaTLU\\Thue\\src\\NhanVien.txt");
            bufferedInputStream=new BufferedInputStream(fileInputStream);

            int i,dem=0;
            String id,ten,ns,TongThuNhap;ten=id=TongThuNhap=ns="";
            while ((i = bufferedInputStream.read()) != -1) {
                if((char)i=='*'){
//                    System.out.println(cmt+"-"+ten+"-"+gt+"-"+ns);
                    NhanVien v=new NhanVien(id,ten,Integer.parseInt(ns),Long.parseLong(TongThuNhap));
                    if(!setNhanVien.contains(v)){
                        setNhanVien.add(v);
                        listNhanVien.add(v);
                    }

                    dem=0;ten=id=TongThuNhap=ns="";
                } else if((char) i != '-'){
                    if(dem==0){
                        id+=""+(char) i;
                    }
                    if(dem==1){
                        ten+=""+(char) i;
                    }
                    if(dem==2){
                        ns+=""+(char) i;
                    }
                    if(dem==3){
                        TongThuNhap+=""+(char) i;
                    }
                }
                else{
                    dem++;
                }
            }

            alert.setContentText("Đã đọc xong");
        } catch (FileNotFoundException e) {
            alert.setContentText("Gặp lỗi");
        } finally {
            bufferedInputStream.close();
            fileInputStream.close();
            alert.show();
        }
    }
}

