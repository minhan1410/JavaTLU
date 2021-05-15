package B1;

import java.util.LinkedList;

public class PlayList {
    LinkedList<AlbumList> playList;

    public PlayList() {
        playList=new LinkedList<AlbumList>();
    }

    public PlayList(LinkedList<AlbumList> playList) {
        this.playList = playList;
    }

    public LinkedList<AlbumList> getPlayList() {
        return playList;
    }

    public void setPlayList(LinkedList<AlbumList> playList) {
        this.playList = playList;
    }

    void Add(BaiHat v){
        for(int i=0;i<playList.size();i++){
            if(playList.get(i).tk_BaiHat(v)){
                playList.get(i).get_Album(i).add_BaiHat(v);
            }
        }
    }
}
