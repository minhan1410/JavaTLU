package SQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TextConnection {
    public static void main(String[] args) throws SQLException {
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

            String sql="select * from DangNhap";

//            ResultSet là một đối tượng Java, nó được trả về khi truy vấn (query) dữ liệu.
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()){
                String tk= resultSet.getString("tk");
                String mk=resultSet.getString("mk");

                System.out.println(resultSet.getString("tk")+"-"+resultSet.getString("mk"));
                System.out.println(mk.equals("1234")+" - "+tk.equals("tien"));
            }



        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
    }
}
