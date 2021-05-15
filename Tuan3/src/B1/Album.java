package B1;

import java.util.ArrayList;

public class Album {
    private ArrayList<BaiHat> a;

    public Album() {
        a=new ArrayList<BaiHat>();
    }

    public Album(ArrayList<BaiHat> a) {
        this.a = a;
    }

    public ArrayList<BaiHat> get() {
        return a;
    }

    public void set(ArrayList<BaiHat> a) {
        this.a = a;
    }

    public boolean tk_BaiHat(BaiHat v){
        for(int i=0;i<a.size();i++){
            if(v.equals(a.get(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return a.equals(album.a);
    }

    public void add_BaiHat(BaiHat v){
        a.add(v);
    }
}
