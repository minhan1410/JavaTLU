package B8;

import java.util.Random;

public class SoNgauNhien {
    private int so;
    private static int SoLgDoiTg = 0;

    public SoNgauNhien() {
        Random random = new Random();
        so = random.nextInt(100) + 1;
        SoLgDoiTg++;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public static int getSoLgDoiTg() {
        return SoLgDoiTg;
    }

    public static void setSoLgDoiTg(int soLgDoiTg) {
        SoLgDoiTg = soLgDoiTg;
    }

    public static void main(String[] args) {
        SoNgauNhien a;
        System.out.println("Dung khi so ngau nhien =14");
        do {
            a = new SoNgauNhien();
            System.out.printf("So lg doi tuong: %-2d", a.getSoLgDoiTg());
            System.out.printf(" - Random: %-2d", a.getSo());
            System.out.printf("%4s", " ");
            if (a.getSoLgDoiTg() % 4 == 0) {
                System.out.println();
            }
        } while (a.getSo() != 14);
    }
}
