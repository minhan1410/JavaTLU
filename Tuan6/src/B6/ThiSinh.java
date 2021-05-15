package B6;

import java.util.Objects;

public class ThiSinh {
    private String name,address;
    private int age;
    private char sex;
    private int id;

    public ThiSinh(){
        this(0,"",0,' ', "");
    }

    public ThiSinh(int id,String name,int age,char sex,String address) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThiSinh thiSinh = (ThiSinh) o;
        return id == thiSinh.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id+" - "+name+" - "+age+" - "+sex+" - "+address+".";
    }
}
