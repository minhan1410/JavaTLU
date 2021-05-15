package BenhVien;

import BenhVien.BenhNhan.BenhNhan;
import BenhVien.BenhNhan.QLBN;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;


import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

//Initializable: Giao diện khởi tạo bộ điều khiển
public class Nhap implements Initializable {

    @FXML
    private TextField txt_cmtBN=new TextField("");
    @FXML
    private TextField txt_nsBN=new TextField("");
    @FXML
    private TextField txt_tenBN=new TextField("");
    @FXML
    private TextField txt_seachTenBN=new TextField("");
    @FXML
    private RadioButton GT_nam;
    @FXML
    private RadioButton GT_nu;
    @FXML
    private RadioButton GT_khac;



    @FXML
    private TableView<BenhNhan> tableBenhNhan;
    @FXML
    private TableColumn<BenhNhan,String> table_CMTND;
    @FXML
    private TableColumn<BenhNhan,String> table_Ten;
    @FXML
    private TableColumn<BenhNhan,Integer> table_NS;
    @FXML
    private TableColumn<BenhNhan,Integer> table_Tuoi;
    @FXML
    private TableColumn<BenhNhan,String> table_GioiTinh;


    //ObservableList: Một danh sách cho phép người nghe theo dõi các thay đổi khi chúng xảy ra
    private ObservableList<BenhNhan> listBenhNhan;
    QLBN qlbn=new QLBN();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        initialize: Để khởi tạo bộ điều khiển sau khi phần tử gốc của nó đã được xử lý hoàn toàn
        qlbn.add(new BenhNhan("1","An","Nam",2001));
        qlbn.add(new BenhNhan("2","Duc","Nam",1973));
        qlbn.add(new BenhNhan("3","Thuy","Nu",1976));
        qlbn.add(new BenhNhan("4","Tien","Nam",2009));
        qlbn.add(new BenhNhan("5","Anh","Nu",2003));
        qlbn.add(new BenhNhan("6","Dat","Nam",1999));
        qlbn.add(new BenhNhan("7","Tinh","Nam",2000));
        qlbn.add(new BenhNhan("8","Anh","Nu",1998));

        listBenhNhan=FXCollections.observableArrayList(qlbn.getList());

//        Kết nối dữ liệu cho các cột từ các thuộc tính của BenhNhan
//        PropertyValueFactory: Tạo một PropertyValueFactory mặc định để lấy dữ liệu trong thuộc tính của Bệnh nhân
//        setCellValueFactory: gán giữ liệu cho cột
        table_CMTND.setCellValueFactory(new PropertyValueFactory<BenhNhan,String>("cmt"));
        table_Ten.setCellValueFactory(new PropertyValueFactory<BenhNhan,String>("ten"));
        table_NS.setCellValueFactory(new PropertyValueFactory<BenhNhan,Integer>("ns"));
        table_Tuoi.setCellValueFactory(new PropertyValueFactory<BenhNhan,Integer>("tuoi"));
        table_GioiTinh.setCellValueFactory(new PropertyValueFactory<BenhNhan,String>("gt"));

        tableBenhNhan.setItems(listBenhNhan);
    }

    @FXML
    void setToggle(ActionEvent event){
        // ToggleGroup: trong cg 1 nhóm 1 thời điểm chỉ được chọn 1 lần
        ToggleGroup gioitinh = new ToggleGroup();
        GT_nam.setToggleGroup(gioitinh);
        GT_nu.setToggleGroup(gioitinh);
        GT_khac.setToggleGroup(gioitinh);

        GT_nam.setText("Nam");
        GT_nu.setText("Nu");
        GT_khac.setText("Khac");
    }

    String GioiTinh(){
        //Xử lý chọn giới tính
        String gt="";

        if(GT_nam.isSelected()){
            gt=GT_nam.getText();
        }
        if(GT_nu.isSelected()){
            gt=GT_nu.getText();
        }
        if(GT_khac.isSelected()){
            gt=GT_khac.getText();
        }

        return gt;
    }

    @FXML
    void checkTextNs(ActionEvent event){
        //Xử lý nhập năm sinh không phải số
        int ns=0;
        try {
            ns=Integer.parseInt(txt_nsBN.getText());
        }catch (NumberFormatException e){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setContentText("Năm sinh phải nhập số");
            alert.show();
        }
    }

    @FXML
    void AddBN(ActionEvent event) {
        BenhNhan v=new BenhNhan(txt_cmtBN.getText(),txt_tenBN.getText(),GioiTinh(),Integer.parseInt(txt_nsBN.getText()));
        if(qlbn.add(v)==true){
            listBenhNhan.add(v);
        }
        else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setContentText("Mỗi bệnh nhân một CMTND");
            alert.show();
        }

//        Check();
    }

    @FXML
    void RemoveAll(ActionEvent event){
        qlbn.removeAll();
        listBenhNhan.removeAll(listBenhNhan);

//        Check();
    }

    @FXML
    void Remove(ActionEvent event){
        BenhNhan v=tableBenhNhan.getSelectionModel().getSelectedItem();
        listBenhNhan.remove(v);
        qlbn.remove(v);

//        Check();
    }

    @FXML
    void Seach(ActionEvent e){
        listBenhNhan.removeAll(listBenhNhan);

        if(txt_seachTenBN.getText().equals("")){
            listBenhNhan.addAll(qlbn.getList());
        }
        else{
            listBenhNhan.addAll(qlbn.seach(txt_seachTenBN.getText()));
        }
    }

    @FXML
    void Close(ActionEvent event){
        Stage stage=(Stage) txt_cmtBN.getScene().getWindow();
        stage.close();
    }

    @FXML
    void LocTuoi(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Lọc theo tuổi");
        alert.setHeaderText("Show thông tin");
        alert.setContentText(qlbn.locTuoi());
        alert.show();
    }

    @FXML
    void Updata(ActionEvent e){
        // Cho phép sửa trên bảng
        tableBenhNhan.setEditable(true);

        table_CMTND.setCellFactory(TextFieldTableCell.<BenhNhan> forTableColumn());
        table_Ten.setCellFactory(TextFieldTableCell.<BenhNhan> forTableColumn());
        table_NS.setCellFactory(TextFieldTableCell.<BenhNhan, Integer>forTableColumn(new IntegerStringConverter()));
        table_GioiTinh.setCellFactory(TextFieldTableCell.<BenhNhan> forTableColumn());

//        Sửa 1 CMT ở cột CMT
        table_CMTND.setOnEditCommit((TableColumn.CellEditEvent<BenhNhan, String> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<BenhNhan, String> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            String newCMTND = event.getNewValue();

            BenhNhan v = event.getTableView().getItems().get(pos.getRow());

            String oldCMTND=v.getCmt();v.setCmt(newCMTND);

//            System.out.println("v "+v.toString()+" new "+newCMTND+" old "+oldCMTND+" contains "+qlbn.getSet().contains(v)+" contains1 "+listBenhNhan.contains(v));

            if(qlbn.getSet().contains(v)){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Lỗi");
                alert.setContentText("Mỗi bệnh nhân một CMTND");
                alert.show();
                v.setCmt(oldCMTND);
            }
            else{
                v.setCmt(newCMTND);
            }
        });

//        Sửa 1 tên ở cột Tên
        table_Ten.setOnEditCommit((TableColumn.CellEditEvent<BenhNhan, String> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<BenhNhan, String> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            String newTen = event.getNewValue();
            int row = pos.getRow();
            BenhNhan v = event.getTableView().getItems().get(row);
            v.setTen(newTen);
        });

//        Sửa 1 năm sinh ở cột năm sinh
        table_NS.setOnEditCommit((TableColumn.CellEditEvent<BenhNhan, Integer> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<BenhNhan, Integer> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            Integer newNS = event.getNewValue();
            int row = pos.getRow();
            BenhNhan v = event.getTableView().getItems().get(row);
            v.setNs(newNS);
        });

//        Sửa 1 giới tính ở cột giới tính
        table_GioiTinh.setOnEditCommit((TableColumn.CellEditEvent<BenhNhan, String> event) -> {
//            TablePosition: để đại diện cho một hàng / cột / ô trong một TableView
            TablePosition<BenhNhan, String> pos = event.getTablePosition();

//            getNewValue():Trả về giá trị mới được nhập bởi người dùng cuối
            String newGT = event.getNewValue();
            int row = pos.getRow();
            BenhNhan v = event.getTableView().getItems().get(row);
            v.setGt(newGT);
        });

        qlbn.removeAll();qlbn.getSet().addAll(listBenhNhan);
//        Check();
    }

    @FXML
    void LuuFileBenhNhan(ActionEvent event) throws IOException {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Lưu file");
        alert.setHeaderText("Đang tiến hành lưu...");

        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;

        try {
            fileOutputStream=new FileOutputStream("C:\\Users\\admin\\Desktop\\BtJava\\Tuan8\\src\\BenhVien\\Data\\BenhNhan.txt");
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            for(int i=0;i<qlbn.getList().size();i++){
                bufferedOutputStream.write((qlbn.getList().get(i).getCmt()+"-"+qlbn.getList().get(i).getTen()+"-"+qlbn.getList().get(i).getGt()+"-"+qlbn.getList().get(i).getNs()+"*").getBytes(StandardCharsets.UTF_8));
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
            fileInputStream=new FileInputStream("C:\\Users\\admin\\Desktop\\BtJava\\Tuan8\\src\\BenhVien\\Data\\BenhNhan.txt");
            bufferedInputStream=new BufferedInputStream(fileInputStream);

            int i,dem=0;
            String cmt,ten,ns,gt;ten=cmt=gt=ns="";
            while ((i = bufferedInputStream.read()) != -1) {
                if((char)i=='*'){
//                    System.out.println(cmt+"-"+ten+"-"+gt+"-"+ns);
                    BenhNhan v=new BenhNhan(cmt,ten,gt,Integer.parseInt(ns));
                    if(qlbn.add(v)==true){
                        listBenhNhan.add(v);
                    }

                    dem=0;ten=cmt=gt=ns="";
                } else if((char) i != '-'){
                    if(dem==0){
                        cmt+=""+(char) i;
                    }
                    if(dem==1){
                        ten+=""+(char) i;
                    }
                    if(dem==2){
                        gt+=""+(char) i;
                    }
                    if(dem==3){
                        ns+=""+(char) i;
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

    void Check(){
        //IN
        if(listBenhNhan.isEmpty()!=true){
            listBenhNhan.forEach(i-> System.out.println("List "+i.toString()));
        }
        else{
            System.out.println("List rong");
        }
        qlbn.show();
    }
}
