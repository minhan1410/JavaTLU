package NganHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends Thread{
    private ArrayList<Account> AccountList;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        AccountList = new ArrayList<Account>();
    }
    public void Xuat(){
        System.out.println("\n=========================MENU====================");
        System.out.println("1.Nhap thong tin cua khach hang");
        System.out.println("2.Xuat thong tin cua khach hang");
        System.out.println("3.Nap tien");
        System.out.println("4.Rut tien");
        System.out.println("5.Dao han");
        System.out.println("6.Chuyen khoan");
        System.out.println("==================================================\n");
    }
    public void LuaChon(int chon) throws InterruptedException {
        switch(chon){
            case 1:{
                System.out.print("So Tk: ");long sTk=scanner.nextLong();
                System.out.print("Ten Tk: ");String tTk=scanner.next();
                System.out.print("So tien: ");double tien=scanner.nextDouble();
                AccountList.add(new Account(sTk, tTk, tien));
                break;
            }
            case 2:{
                for(Account i: AccountList){
                    System.out.println(i.toString());
                }
                Thread.sleep(3000);
                break;
            }
            case 3:{
                System.out.print("Nhap so Tk: ");long sTk=scanner.nextLong();
                for(int i=0;i<AccountList.size();i++){
                    if(AccountList.get(i).getSoTK()==sTk){
                        System.out.print("So tien: ");double tien=scanner.nextDouble();
                        AccountList.get(i).NapTien(tien);
                    }
                }
                break;
            }
            case 4:{
                System.out.print("Nhap so Tk: ");long sTk=scanner.nextLong();
                for(int i=0;i<AccountList.size();i++){
                    if(AccountList.get(i).getSoTK()==sTk){
                        System.out.print("So tien: ");double tien=scanner.nextDouble();
                        AccountList.get(i).RutTien(tien);
                    }
                }
                break;
            }
            case 5:{
                System.out.print("Nhap so Tk: ");long sTk=scanner.nextLong();
                for(int i=0;i<AccountList.size();i++){
                    if(AccountList.get(i).getSoTK()==sTk){
                        AccountList.get(i).DaoHan();
                    }
                }
                break;
            }
            case 6:{
                System.out.print("Nhap so Tk: ");long sTk=scanner.nextLong();
                for(int i=0;i<AccountList.size();i++){
                    if(AccountList.get(i).getSoTK()==sTk){
                        System.out.print("Nhap so Tk muon chuyen: ");long sTkc=scanner.nextLong();
                        System.out.print("So tien muon chuyen: ");double tienc=scanner.nextDouble();
                        for(int j=0;j<AccountList.size();j++){
                            if(AccountList.get(i).ChuyenKhoan(sTkc,tienc)==AccountList.get(j).getSoTK()){
                                AccountList.get(j).NapTien(tienc);
                            }
                        }
                    }
                }
                break;
            }
        }
    }
}
