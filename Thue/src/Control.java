package src;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Control implements Initializable {
    @FXML
    private Text tienText;

    @FXML
    private TextField nguoiText;

    @FXML
    private Text thueText;

    @FXML
    private Text thueCaNamText;

    @FXML
    private TableView<Table> Bang;

    @FXML
    private TableColumn<Table, Integer> bacColumn;

    @FXML
    private TableColumn<Table, String> thuNhapColumn;

    @FXML
    private TableColumn<Table, String> thueSuatColumn;

    @FXML
    private ListView<String> bangPro;

    @FXML
    private RadioButton thang;

    @FXML
    private RadioButton nam;

    ObservableList<String> CacTinh = FXCollections.observableArrayList();

    //Hiển thị số đẹp
    DecimalFormat decimalFormat = new DecimalFormat("###,###.###");

    ObservableList<Table> tableThang = FXCollections.observableArrayList(
        new Table(1, "0 đến 5 ","5%"),
        new Table(2, "Trên 5 đến 10","10%"),
        new Table(3, "Trên 10 đến 18","15%"),
        new Table(4, "Trên 18 đến 32","20%"),
        new Table(5, "Trên 32 đến 52","25%"),
        new Table(6, "Trên 52 đến 80","30%"),
        new Table(7, "Trên 80 ","35%")
    );

    ObservableList<Table> tableNam = FXCollections.observableArrayList(
            new Table(1, "0 đến 60 ","5%"),
            new Table(2, "Trên 60 đến 120","10%"),
            new Table(3, "Trên 120 đến 216","15%"),
            new Table(4, "Trên 216 đến 384","20%"),
            new Table(5, "Trên 384 đến 624","25%"),
            new Table(6, "Trên 624 đến 960","30%"),
            new Table(7, "Trên 960 ","35%")
    );
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bacColumn.setCellValueFactory(new PropertyValueFactory<>("Bac"));
        thuNhapColumn.setCellValueFactory(new PropertyValueFactory<>("thuNhap"));
        thueSuatColumn.setCellValueFactory(new PropertyValueFactory<>("thuSuat"));

        thueText.setText("0 Đồng");
        thueCaNamText.setText("0 Đồng");
        bangPro.setItems(CacTinh);
    }

    public void set(NhanVien nv){
        tienText.setText(String.valueOf(nv.getTongThuNhap()));
    }

    public void Reset()
    {
        thueText.setText("0 Đồng");
        thueCaNamText.setText("0 Đồng");
        CacTinh.clear();
    }

    public int[] S(){
        int[] a  = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
        if(nam.isSelected()){
            for(int i=0;i<a.length;i++){
                a[i]*=12;
            }
        }
        return a;
    }

    public void Tinh() {
        CacTinh.clear();
        long Tong = 0, nguoi = 0;
        int dem = 0;double tien=0;
        try{
            tien= Double.parseDouble(tienText.getText());
            if (nguoiText.getText().equals("")) {
                nguoi = 0;
            }else{
                nguoi = Long.parseLong(nguoiText.getText());
            }

//            int[] S = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
            double[] P = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
            int []S=S();
            long tienChiuThue = thang.isSelected() ?(long) (tien - nguoi * 4400000 - 11000000):(long) (tien - nguoi * 4400000*12 - 11000000*12);

            if (tienChiuThue <= 0) {
                CacTinh.add("Không phải nộp");
                thueText.setText("0 Đồng");
            }
            else {
                long gtbt=thang.isSelected()?11000000:11000000*12,gtnpt=thang.isSelected()?4400000:4400000*12;

                CacTinh.add("Giảm trừ bản thân: "+decimalFormat.format(gtbt)+" đồng");
                CacTinh.add("Giảm trừ người phụ thuộc: "+nguoi+" * "+decimalFormat.format( gtnpt)+" = "+decimalFormat.format(nguoi*gtnpt)+" đồng" );
                CacTinh.add("Tiền chịu thuế: "+decimalFormat.format(tien)+"- "+decimalFormat.format(gtbt)+" - "+nguoi*gtnpt+" = "+decimalFormat.format(tienChiuThue));
                while (tienChiuThue > S[dem] ) {
                    if(tienChiuThue<S[dem+1])
                    {
                        break;
                    }
                    Tong = (long)(P[dem] * (S[dem+1]-S[dem]) + Tong);
                    CacTinh.add("Bậc " +(dem+1)+ " số thuế phải chịu:  ("+ decimalFormat.format(S[dem+1])+" - "+decimalFormat.format(S[dem])+" )* "+P[dem]+" = " +decimalFormat.format((S[dem+1]-S[dem]) *P[dem] )+" đồng" );
                    dem++;
                    if(dem==6){
                        break;
                    }
                }
                Tong = (long)((tienChiuThue-S[dem]) *P[dem] +Tong);


                CacTinh.add("Bậc " +(dem+1)+ " số thuế phải chịu: ("+decimalFormat.format(tienChiuThue)+" - "+decimalFormat.format(S[dem])+" )* "+P[dem]+" = " +decimalFormat.format( (tienChiuThue-S[dem])*P[dem] ) +" đồng" );


                if(thang.isSelected()){
                    CacTinh.add("Thuế thu nhập theo tháng: "+decimalFormat.format(Tong) +" Đồng");
                    thueText.setText( decimalFormat.format(Tong) +" Đồng");
                    CacTinh.add("Thuế thu nhập cả năm: "+decimalFormat.format(Tong*12) +" Đồng");
                    thueCaNamText.setText( decimalFormat.format(Tong*12) +" Đồng");
                }
                else{
                    CacTinh.add("Thuế thu nhập theo tháng: "+decimalFormat.format(Tong/12) +" Đồng");
                    thueText.setText( decimalFormat.format(Tong/12) +" Đồng");
                    CacTinh.add("Thuế thu nhập cả năm: "+decimalFormat.format(Tong) +" Đồng");
                    thueCaNamText.setText( decimalFormat.format(Tong) +" Đồng");
                }
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.WARNING,"Nhập sai\n");
            alert.show();
        }
    }

    @FXML
    void setToggle(ActionEvent event){
        // ToggleGroup: trong cg 1 nhóm 1 thời điểm chỉ được chọn 1 lần
        ToggleGroup chon = new ToggleGroup();
        thang.setToggleGroup(chon);
        nam.setToggleGroup(chon);

        if(thang.isSelected()){
            Bang.setItems(tableThang);
        }
        else if(nam.isSelected()){
            Bang.setItems(tableNam);
        }
    }

}
