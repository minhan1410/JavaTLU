package BtT3;

import java.util.ArrayList;

public class AlbumList {
    private ArrayList<Album> abl;
    private Album ab;

    public AlbumList() {
        abl=new ArrayList<Album>();
        ab=new Album();
    }

    public ArrayList<Album> getAbl() {
        return abl;
    }

    public void setAbl(ArrayList<Album> abl) {
        this.abl = abl;
    }

    public Album getAb() {
        return ab;
    }

    public void setAb(Album ab) {
        this.ab = ab;
    }
}
