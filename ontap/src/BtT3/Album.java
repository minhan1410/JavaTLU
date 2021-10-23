package BtT3;

import java.util.ArrayList;

public class Album {
    private ArrayList<BaiHat> bh;

    public Album() {
        bh=new ArrayList<BaiHat>();
    }

    public ArrayList<BaiHat> getBh() {
        return bh;
    }

    public void setBh(ArrayList<BaiHat> bh) {
        this.bh = bh;
    }
}
