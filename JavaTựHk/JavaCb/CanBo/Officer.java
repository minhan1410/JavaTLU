package CanBo;

public class Officer {
    private String name,sex,address;
    private int age;

    public Officer() {
    }

    public Officer(String name, String sex, String address, int age) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Officer [address=" + address + ", age=" + age + ", name=" + name + ", sex=" + sex + "]";
    } 
}
