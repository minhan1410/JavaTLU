package DongBo.VD3;

public class Share_Data {
    private String []name={"Anh","An","Anh","Hung","Duc","Thuy","Tien"};
    private String []address={"1","2","3","4","5","6","7"};

    String getName(int vt){
        return name[vt-1];
    }

    String getAddress(int vt){
        return address[vt-1];
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }
}
