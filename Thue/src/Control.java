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

    ObservableList<String> CacTinh = FXCollections.observableArrayList();

    //Hiển thị số đẹp
    DecimalFormat decimalFormat = new DecimalFormat("###,###.###");

    ObservableList<Table> tb = FXCollections.observableArrayList(
        new Table(1, "0 đến 5 ","5%"),
        new Table(2, "Trên 5 đến 10","10%"),
        new Table(3, "Trên 10 đến 18","15%"),
        new Table(4, "Trên 18 đến 32","20%"),
        new Table(5, "Trên 32 đến 52","25%"),
        new Table(6, "Trên 52 đến 80","30%"),
        new Table(7, "Trên 80 ","35%")
    );
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bacColumn.setCellValueFactory(new PropertyValueFactory<>("Bac"));
        thuNhapColumn.setCellValueFactory(new PropertyValueFactory<>("thuNhap"));
        thueSuatColumn.setCellValueFactory(new PropertyValueFactory<>("thuSuat"));
        Bang.setItems(tb);
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

            int[] S = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
            double[] P = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
            long tienChiuThue = (long) (tien - nguoi * 4400000 - 11000000);
            if (tienChiuThue <= 0) {
                CacTinh.add("Không phải nộp");
                thueText.setText("0 Đồng");
            }
            else {
                CacTinh.add("Giảm trừ bản thân: 11.000.000 đồng");
                CacTinh.add("Giảm trừ người phụ thuộc: "+nguoi+" * 4.400.000 = "+decimalFormat.format(nguoi*4400000)+" đồng" );
                CacTinh.add("Tiền chịu thuế: "+decimalFormat.format(tien)+"- 11.000.000 - "+nguoi*4400000+" = "+decimalFormat.format(tienChiuThue));
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
                CacTinh.add("Thuế thu nhập: "+decimalFormat.format(Tong) +" Đồng");
                CacTinh.add("Thuế thu nhập cả năm: "+decimalFormat.format(Tong*12) +" Đồng");
                thueText.setText( decimalFormat.format(Tong) +" Đồng");
                thueCaNamText.setText( decimalFormat.format(Tong*12) +" Đồng");
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.WARNING,"Nhập sai\n");
            alert.show();
        }
    }
}
