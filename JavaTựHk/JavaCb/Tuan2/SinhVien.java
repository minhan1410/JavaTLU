package Tuan2;
public class SinhVien{
	private String ten;
	private int year;
	private double diem;
	public SinhVien() {
        ten="";year=0;diem=0;
    }
	public SinhVien(String ten, int year, double diem) {
		this.ten = ten;
		this.year = year;
		this.diem = diem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
    public int getTuoi(){
        return 2021-year;
    }
    public void ThongTin(){
        System.out.println(getTen()+", "+getTuoi()+", "+getDiem());
    }
}
