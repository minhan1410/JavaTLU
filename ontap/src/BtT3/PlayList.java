package BtT3;

import java.util.LinkedList;

public class PlayList {
    private LinkedList<BaiHat> pl;
    private AlbumList abl;
    private int  open;

    public PlayList() {
        pl=new LinkedList<BaiHat>();
        abl=new AlbumList();
        open=0;
    }

    public void add(BaiHat v){
        if(abl.getAb().getBh().contains(v)){
            pl.add(v);
        }
        else{
            System.out.println("Abl k ton tai");
        }
    }

    public BaiHat nowPlay(){
        return pl.get(0);
    }

    public BaiHat next(){
        return pl.get(++open);
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public LinkedList<BaiHat> getPl() {
        return pl;
    }

    public void setPl(LinkedList<BaiHat> pl) {
        this.pl = pl;
    }

    public AlbumList getAbl() {
        return abl;
    }

    public void setAbl(AlbumList abl) {
        this.abl = abl;
    }
}
