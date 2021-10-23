package Tuan2.Bai7;


public class Bai7 {
    public static void main(String[] args) {
        System.out.println("hihi");
        SoNgauNhien a;
        do{
            a=new SoNgauNhien();
            System.out.printf("So lg doi tuong: %-2d",a.getSoLgDoiTg());System.out.printf(" - Random: %-2d",a.getSo());
            System.out.printf("%4s"," ");
            if(a.getSoLgDoiTg()%4 ==0){
                System.out.println();
            }
        }while(a.getSo()!=14);
    }
}
