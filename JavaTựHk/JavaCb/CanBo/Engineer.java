package CanBo;

public class Engineer extends Officer {
    private String nganh;

    public Engineer(String nganh) {
        this.nganh = nganh;
    }

    public Engineer(String name, String sex, String address, int age, String nganh) {
        super(name, sex, address, age);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" -- Engineer [nganh=" + nganh + "]";
    }
}