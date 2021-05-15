package BenhVien.BenhNhan;

import java.util.*;

public class QLBN {
    private Set<BenhNhan> set;
    private LinkedList<BenhNhan> list;

    public QLBN() {
        set = new LinkedHashSet<BenhNhan>();
    }

    public QLBN(Set<BenhNhan> set) {
        this.set = set;
    }

    public List<BenhNhan> getList() {
        return new ArrayList<BenhNhan>(set);
    }

    public Set<BenhNhan> getSet() {
        return set;
    }

    public Boolean add(BenhNhan v) {
        if (!set.contains(v)) {
            set.add(v);
            return true;
        }
        return false;
    }

    public void show() {
        if(set.size()==0){
            System.out.println("Rỗng");
        }
        else{
            set.forEach((i) -> System.out.println(i.toString()));
            System.out.println();
        }
    }

    public void removeAll() {
        set.clear();
    }

    public void remove(BenhNhan v){
        list=new LinkedList<BenhNhan>(set);
        remove(list.indexOf(v));
    }

    public void remove(int vt){
        list=new LinkedList<BenhNhan>(set);
        list.remove(list.get(vt));

        set.clear();set.addAll(list);
    }

    public void sxTen() {
        list=new LinkedList<BenhNhan>(set);
        Collections.sort(list, (v1, v2) -> v1.getTen().compareTo(v2.getTen()));
        removeAll();
        set.addAll(list);
    }

    public void sxTuoi() {
        set = new TreeSet<BenhNhan>(set);
    }

    public String locTuoi() {
        list = new LinkedList<BenhNhan>(set);
        int TreEm, NgLon, NgGia;
        TreEm = NgLon = NgGia = 0;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTuoi() >= 0 && list.get(i).getTuoi() < 18) {
                TreEm++;
            } else if (list.get(i).getTuoi() >= 18 && list.get(i).getTuoi() < 60) {
                NgLon++;
            } else if (list.get(i).getTuoi() >= 60) {
                NgGia++;
            }
        }

        String str="";
        str+="Trẻ em: " + TreEm+"\n";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTuoi() >= 0 && list.get(i).getTuoi() < 18) {
                str+= "\t+) " + list.get(i).toString()+"\n";
            }
        }

        str+= "\nNgười lớn: " + NgLon+"\n";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTuoi() >= 18 && list.get(i).getTuoi() < 60) {
                str+= "\t+) " + list.get(i).toString()+"\n";
            }
        }

        str+="\nNgười già: " + NgGia+"\n";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTuoi() >= 60) {
                str+= "\t+) " + list.get(i).toString()+"\n";
            }
        }
        return str+"\n";
    }

    public void updata(BenhNhan v){
        list=new LinkedList<BenhNhan>(set);
        updata(list.indexOf(v));
    }

    public void updata(int vt){
        Scanner scanner=new Scanner(System.in);

        list=new LinkedList<BenhNhan>(set);
        BenhNhan updata= list.get(vt);

        System.out.print("Bạn muốn sửa thông tin gì?\n1) CMTND\n2) Tên\n3) Năm sinh\n4) Cả ba\nChọn: ");int chon=scanner.nextInt();
        while(chon<1 || chon>4){
            System.out.print("Chọn: ");chon=scanner.nextInt();
        }
        if (chon==1){
            System.out.print("Nhập CMTND: ");String cmt=scanner.next();
            updata.setCmt(cmt);
        }
        else if(chon==2){
            System.out.print("Nhập tên: ");scanner.nextLine();String ten=scanner.nextLine();
            updata.setTen(ten);
        }
        else if(chon==3){
            System.out.print("Nhập năm sinh: ");int ns=scanner.nextInt();
            updata.setNs(ns);
        }
        else{
            System.out.print("Nhập CMTND: ");String cmt=scanner.next();scanner.nextLine();
            System.out.print("Nhập tên: ");String ten=scanner.nextLine();
            System.out.print("Nhập năm sinh: ");int ns=scanner.nextInt();
            updata.setCmt(cmt);updata.setTen(ten);updata.setNs(ns);
        }

        list.set(vt,updata);
        set.clear();
        set.addAll(list);
    }

    public LinkedList<BenhNhan> seach(String name){
        list=new LinkedList<BenhNhan>(set);
        LinkedList<BenhNhan> listname=new LinkedList<BenhNhan>();
        boolean flag = false;

        for(int i=0;i<list.size();i++){
            if(list.get(i).getTen().compareTo(name) >=  0){
                for(int j=0;j<name.length();j++){
                    if(list.get(i).getTen().charAt(j)==name.charAt(j)){
                        flag=true;
                    }
                    else{
                        flag=false;
                    }
                }

                if(flag==true){
                    listname.add(list.get(i));
                }
            }
        }
        return listname;
    }

    public static void main(String[] args) {
        QLBN qlbn=new QLBN();
        qlbn.add(new BenhNhan("1","Nguyễn An","M",2001));
        qlbn.add(new BenhNhan("2","Nguyễn An","M",2001));
        qlbn.add(new BenhNhan("1","An A A","M",2001));
        qlbn.add(new BenhNhan("3","Trần An","M",2003));
        qlbn.add(new BenhNhan("4","Văn An","M",2004));
        qlbn.add(new BenhNhan("5","Lê An","M",2002));
        qlbn.add(new BenhNhan("6","Hồ An","M",2005));

        qlbn.show();

        System.out.println("Sx tên");qlbn.sxTen();qlbn.show();
        System.out.println("Sx tuổi");qlbn.sxTuoi();qlbn.show();

        System.out.println(qlbn.locTuoi());

        System.out.println("\nSửa");
        qlbn.updata(new BenhNhan("1","Nguyễn An","M",2001));qlbn.show();
        qlbn.updata(4);qlbn.show();

        System.out.println("Xóa");
        qlbn.remove(new BenhNhan("4","Văn An","M",2004));qlbn.show();
        qlbn.remove(3);qlbn.show();
        qlbn.removeAll();qlbn.show();

    }
}
