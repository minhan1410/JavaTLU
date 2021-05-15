package B1;

import java.util.ArrayList;

public class AlbumList {
    private ArrayList<Album> albumList;

    public AlbumList() {
        albumList=new ArrayList<Album>();
    }

    public AlbumList(ArrayList<Album> albumList) {
        this.albumList = albumList;
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(ArrayList<Album> albumList) {
        this.albumList = albumList;
    }

    public boolean tk_BaiHat(BaiHat v){
        for(int i=0;i<albumList.size();i++){
            if(albumList.get(i).tk_BaiHat(v)){
                return true;
            }
        }
        return false;
    }

    public Album get_Album(int v){
        for(int i=0;i<albumList.size();i++){
            if(i==v){
                return albumList.get(i);
            }
        }
        return null;
    }
}
