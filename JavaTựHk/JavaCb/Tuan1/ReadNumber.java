package Tuan1;

public class ReadNumber {
    public static void Read(int n){
        String []dv={"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        String []chuc={"linh","mười","hai mươi","ba mươi","bốn mươi","năm mươi","sáu mươi","bảy mươi","tám mươi","chín mươi"};
        String []tram={"không trăm","một trăm","hai trăm","ba trăm","bốn trăm","năm trăm","sáu trăm","bảy trăm","tám trăm","chín trăm"};

        int cd=1;
        for(int i=1;i<Integer.toString(n).length();i++){
            cd*=10;
        }

        if(n==0){
            System.out.print(dv[0]);
        }
        
        while (n != 0) {
            if (cd >= 100000000 && cd < 1000000000) {
                System.out.print(tram[n / cd] + " ");
            }
            if (cd >= 10000000 && cd < 100000000) {
                System.out.print(chuc[n / cd] + " ");
            }
            if (cd >= 1000000 && cd < 10000000) {
                System.out.print(dv[n / cd] + " triệu ");
            }

            if (cd >= 100000 && cd < 1000000) {
                System.out.print(tram[n / cd] + " ");
            }
            if (cd >= 10000 && cd < 100000) {
                System.out.print(chuc[n / cd] + " ");
            }
            if (cd >= 1000 && cd < 10000) {
                System.out.print(dv[n / cd] + " nghìn ");
            }

            if (cd >= 100 && cd < 1000) {
                System.out.print(tram[n / cd] + " ");
            }
            if (cd >= 10 && cd < 100) {
                System.out.print(chuc[n / cd] + " ");
            }
            if (cd < 10) {
                System.out.print(dv[n / cd] + " ");
            }

            n %= cd;cd /= 10;
        }
    }
    public static void main(String[] args) {
        Read(951912345);
    }
}
