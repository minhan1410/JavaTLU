package BtT3;

public class t3 {
    public static void main(String[] args) {


        PlayList pl=new PlayList();
        pl.getAbl().getAb().getBh().add(new BaiHat("1",0));
        pl.getAbl().getAb().getBh().add(new BaiHat("2",0));
        pl.getAbl().getAb().getBh().add(new BaiHat("3",0));
        pl.getAbl().getAb().getBh().add(new BaiHat("4",0));
        pl.getAbl().getAb().getBh().add(new BaiHat("5",0));
        pl.getAbl().getAb().getBh().add(new BaiHat("6",0));

//        System.out.println(pl.getAbl().getAb().getBh().contains(new BtT3.BaiHat("4",0)));

        pl.add(new BaiHat("4",0));
        pl.add(new BaiHat("3",0));
        pl.add(new BaiHat("2",0));
        pl.add(new BaiHat("1",0));
        pl.add(new BaiHat("5",0));
        pl.add(new BaiHat("6",0));

        System.out.println(pl.nowPlay());
        System.out.println(pl.next());
        System.out.println(pl.next());
        System.out.println(pl.next());
        System.out.println(pl.next());
        System.out.println(pl.next());
    }
}
