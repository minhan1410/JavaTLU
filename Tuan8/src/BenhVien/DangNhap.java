package BenhVien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;

public class DangNhap {

    @FXML
    private TextField txtDn;

    @FXML
    private PasswordField txtMk;

    @FXML
    void DangNhap(ActionEvent event) throws IOException, InterruptedException, SQLException {
//        Kết nối với SQL SERVER
        SQLServerDataSource sqlServerDataSource=new SQLServerDataSource();
        sqlServerDataSource.setUser("sa");
            sqlServerDataSource.setPassword("14102001");
        sqlServerDataSource.setServerName("DESKTOP-LD6PBDF\\SQLEXPRESS");
        sqlServerDataSource.setPortNumber(1433);
        sqlServerDataSource.setDatabaseName("BenhVien");

        try{
//            Phương thức getConnection (String url) của lớp Java DriverManager cố gắng thiết lập kết nối với cơ sở dữ liệu bằng cách sử dụng URL cơ sở dữ liệu đã cho.
            Connection connection = sqlServerDataSource.getConnection();

//            Statement interface trong java cung cấp các phương thức để thực thi các câu lệnh truy vấn với cơ sở dữ liệu SQL.
//            Statement cung cấp phương thức để tạo ra đối tượng ResultSet.
            Statement statement = connection.createStatement();

//            Truy vấn sql
            String sql="select * from DangNhap";

//            ResultSet là một đối tượng Java, nó được trả về khi truy vấn (query) dữ liệu.
            ResultSet resultSet=statement.executeQuery(sql);


            String tk,mk; tk=mk=""; boolean flag=false;
            while (resultSet.next()){
                tk= resultSet.getString("tk");
                mk=resultSet.getString("mk");

//                System.out.println(tk+" - "+mk);

                if(txtDn.getText().equals(tk) && txtMk.getText().equals(mk)){
                    flag=true;
                }
            }

            Alert alert=new Alert(Alert.AlertType.INFORMATION);
//            Kiểm tra thông tin
            if(flag==true){
                Stage close1=(Stage) txtDn.getScene().getWindow();
                close1.close();

                Parent root= FXMLLoader.load(getClass().getResource("QLBA.fxml"));
                Stage stage =new Stage();
                stage.setTitle("Điền thông tin");
                stage.setScene(new Scene(root));
                stage.show();
            }
            else{
                alert.setContentText("Tên đăng nhập hoặc mật khẩu không đúng");
                alert.show();
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
    }
}
