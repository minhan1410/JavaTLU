package Tuan1;

import java.util.Scanner;

public class t1 {
    public static int SumOdd(int n){
        int chay=1,d=1,s=0;
		while(d<=n){
			s+=chay;
			chay+=2;
			d++;
		}
		return s;
    }
    public static boolean CheckPalindrome(int n){
        int s=n;int t=0;
        while(s!=0){
            t=(t*10)+s%10;
            s/=10;
        }
        if(t==n){
            return true;
        }
        return false;
    }
    public static boolean CheckSnt(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void ReadNumber(int n){
        String []dv={"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        String []chuc={"linh","mười","hai mươi","ba mươi","bốn mươi","năm mươi","sáu mươi","bảy mươi","tám mươi","chín mươi"};
        String []tram={"không trăm","một trăm","hai trăm","ba trăm","bốn trăm","năm trăm","sáu trăm","bảy trăm","tám trăm","chín trăm"};
        String []nghin={"","một nghìn","hai nghìn","ba nghìn","bốn nghìn","năm nghìn","sáu nghìn","bảy nghìn","tám nghìn","chín nghìn"};

        int cd=1;
        for(int i=1;i<Integer.toString(n).length();i++){
            cd*=10;
        }

        if(n==0){
            System.out.print(dv[0]);
        }
        
        while(n!=0){
            if(cd>=1000){
                System.out.print(nghin[n/cd]+" ");
            }
            if(cd>=100 && cd<1000){
                System.out.print(tram[n/cd]+" ");
            }
            if(cd>=10 && cd<100){
                System.out.print(chuc[n/cd]+" ");
            }
            if(cd<10){
                System.out.print(dv[n/cd]+" ");
            }

            n%=cd;cd/=10;
        }
    }
    public static int Ucln(int a,int b){
        if(b==0){
            return a;
        }
        return Ucln(b,a%b);
    }
    public static int Bcnn(int a,int b){
        return a*b /Ucln(a, b);
    }
    public static void Snt(int n){
        for(int i=2;i<=n;i++){
            if(CheckSnt(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void B7(){
        Scanner scanner = new Scanner(System.in);
        int n;int sum=0,dem=0,max=0,min=0;
        do{
            n=scanner.nextInt();
            sum+=n;dem++;
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }while(n!=0);
        System.out.println("Max: "+max+" - Min: "+min);
        System.out.println("Tong: "+sum+" - TBC: "+sum/dem);
        scanner.close();
    }
    public static double B10(int n){
        double s=0;
        for(int i=1;i<=n;i++){
            s+=1/(2.0*i);
        }
        return s;
    }
    public static void B8(String n){
        System.out.print(n+" Bytes = ");

        long b=1,kb=1024,mb=1024*kb,gb=1024*mb,tb=1024*gb,pb=1024*tb,eb=1024*pb;
        int d_b=0,d_kb=0,d_mb=0,d_gb=0,d_tb=0,d_pb=0,d_eb=0;

        while(Long.parseLong(n)!=0){
            while(Long.parseLong(n)>=eb){
                n=String.valueOf(Long.parseLong(n)-eb);
                d_eb++;
            }
            while(Long.parseLong(n)>=pb){
                n=String.valueOf(Long.parseLong(n)-pb);
                d_pb++;
            }
            while(Long.parseLong(n)>=tb){
                n=String.valueOf(Long.parseLong(n)-tb);
                d_tb++;
            }
            while(Long.parseLong(n)>=gb){
                n=String.valueOf(Long.parseLong(n)-gb);
                d_gb++;
            }
            while(Long.parseLong(n)>=mb){
                n=String.valueOf(Long.parseLong(n)-mb);
                d_mb++;
            }
            while(Long.parseLong(n)>=kb){
                n=String.valueOf(Long.parseLong(n)-kb);
                d_kb++;
            }
            while(Long.parseLong(n)>=b){
                n=String.valueOf(Long.parseLong(n)-b);
                d_b++;
            }
        }
        
        if(d_eb!=0){
            System.out.print(d_eb+"EB + ");
        }
        if(d_pb!=0){
            System.out.print(d_pb+"PB + ");
        }
        if(d_tb!=0){
            System.out.print(d_tb+"TB + ");
        }
        if(d_gb!=0){
            System.out.print(d_gb+"GB + ");
        }
        if(d_mb!=0){
            System.out.print(d_mb+"MB + ");
        }
        if(d_kb!=0){
            System.out.print(d_kb+"KB + ");
        }
        if(d_b!=0){
            System.out.print(d_b+"Byte");
        }
    }
    public static void main(String[] args) {
        //System.out.println("Sum odd: "+SumOdd(6));
        // System.out.println("Check Palindrome: "+CheckPalindrome(91019));
        //System.out.println("Check Snt: "+CheckSnt(0));
        //ReadNumber(3210);
        //System.out.println(Ucln(91, 287)+" - "+Bcnn(91,287));
        //Snt(10);
        //B7();
        //System.out.println("Sum: "+B10(3));
        //B8("9223372036854775807");
    }
}
