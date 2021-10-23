package sample.NhanVien;
import java.util.Scanner;

public class NhanVien {
	private String Ten,Ma;
	private int id;
	Scanner scanner=new Scanner(System.in);
	public NhanVien() {
		Ten=Ma="";
	}
	
	public NhanVien(String ten, String ma,int id) {
		Ten = ten;
		Ma = ma;
		this.id=id;
	}
	
	public void Add(String ten,String ma,int id){
		setTen(ten);setMa(ma);setId(id);
	}
	
	public String getTen() {
		return Ten;
	}
	
	public void setTen(String ten) {
		Ten = ten;
	}
	
	public String getMa() {
		return Ma;
	}
	
	public void setMa(String ma) {
		Ma = ma;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "NhanVien{" +"Id: "+id+" "+ "Ten='" + Ten + '\'' + ", Ma='" + Ma + '\'' + "}\n";
	}
}
                                  