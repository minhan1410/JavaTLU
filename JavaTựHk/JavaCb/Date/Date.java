package Date;

public class Date {
    private int day,moth,year;
    
    public Date() {
        day=moth=year=1;
    }
    
    public Date(int day, int moth, int year) {
        this.day = day;
        this.moth = moth;
        this.year = year;
    }

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMoth() {
		return moth;
	}

	public void setMoth(int moth) {
		this.moth = moth;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
    }
    
    //Sau n ngày là ngày nào
    public Date Sum(int n){
        Date b=new Date(day,moth,year);
        int d_m,d_y;
        while(n!=0){
            // KT moth
            if(b.moth==2){
                if(((b.year%4==0)&&(b.year%100==0))||(b.year%400==0)){
                    d_m=29;
                }
                else{
                    d_m=28;
                }
            }
            else if(b.moth==4 || b.moth==6 ||b.moth==9 ||b.moth==11){
                d_m=30;
            }
            else{
                d_m=31;
            }

            //Kt year
            if(((b.year%4==0)&&(b.year%100==0))||(b.year%400==0)){
                d_y=366;
            }
            else{
                d_y=365;
            }
            
            //Tăng dần ngày tháng năm
            if(n<=d_m){
                b.day+=n;
                n-=n;
            }
            if(n>d_m &&n<d_y){
                n-=(d_m-b.day); //n - (số ngày trong tháng - ngày mk nhập) 
                b.day=0;
                b.moth++;
            }
            if(n>=d_y){
                n-=d_y;
                b.year++;
            }
            
            //Kt xm ngày có vượt quá ngày trong tháng k
            if(b.day>d_m){
                b.day-=d_m;
                b.moth++;
            }

            //Kt xm tháng có vượt quá số tháng trong năm k
            if(b.moth==13){
                b.moth=1;
                b.year++;
            }
        }
        
        return b;
    }

    //Can chi
    public void CanChi()
	{ 
		String c[]={"Canh","Tan","Nham","Quy","Giap","At","Binh","Dinh","Mau","Ky"};
		String d[]={"Than","Dau","Tuat","Hoi","Ty","Suu","Dan","Mao","Thin","Ty","Ngo","Mui"};
		int can= year%10;
		int chi=year%12;
		System.out.println(c[can]+" "+d[chi]);
    }
    
    //Tính khoảng cách giữa 2 ngày
    int Tinh(Date a)
	{ 
        if(a.moth < 3)
		{ 
            a.year--;
			a.moth +=12;
		}
		return 365*a.year + a.year/4 - a.year/100 + a.year/400 + (153*a.moth - 457)/5 +a.day-306;
	}
	public int KhoangCach(Date b)
	{ 
		int c=Tinh(this)-Tinh(b);
		if(c<0)
		{ 
            c=Math.abs(c);
		}
		return c;
    }
    
    //Tính thứ
    public String Thu()
	{
		int JMD;
		JMD = (day + ((153 * (moth + 12 * ((14 - moth) / 12) - 3) + 2) / 5) + (365 * (year + 4800 - ((14 - moth) / 12))) + ((year + 4800 - ((14 - moth) / 12)) / 4) - ((year + 4800 - ((14 - moth) / 12)) / 100) + ((year + 4800 - ((14 - moth) / 12)) / 400)  - 32045) % 7;
		String weekday[] = {"Thu 2", "Thu 3", "Thu 4","Thu 5", "Thu 6", "Thu 7", "Chu nhat"};
		return weekday[JMD];
	}
    
    @Override
    public String toString() {
        return Thu()+": "+day + " / " + moth + " / " + year;
    }
}
