import B1.SetSV;
import B1.SinhVien;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void B1() {
        SetSV menu = new SetSV();
        int chon;
        String msv, ten;
        double d;

        while (true) {
            System.out.println("======================MENU======================\n" +
                    "1. Add SV\n2. Show SV\n" +
                    "3. Sắp xếp theo mã sinh viên\n4. Sắp xếp theo họ và tên\n" +
                    "5. Sắp xếp theo điểm tốt nghiệp\n0. EXIT");
            System.out.print("Chon: ");

            try {
                chon = scanner.nextInt();
                if (chon == 1) {
                    System.out.print("Nhap MSV: ");
                    msv = scanner.nextLine();
                    System.out.print("Nhap ten: ");
                    ten = scanner.nextLine();
                    System.out.print("Nhap diem: ");
                    d = scanner.nextDouble();
                    menu.add(new SinhVien(msv, ten, d));
                } else if (chon == 2) {
                    menu.show();
                } else if (chon == 3) {
                    menu.sxMSV();
                } else if (chon == 4) {
                    menu.sxTen();
                } else if (chon == 5) {
                    menu.sxDiem();
                } else if (chon == 0) {
                    System.out.println("\uD83D\uDE03\uD83D\uDE03Cảm ơn đã sử dụng\uD83D\uDE03\uD83D\uDE03");
                    break;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi nhập kí tự " + e);
                break;
            }
        }
    }

    public static void B2() {
        System.out.print("s: ");
        String s = scanner.nextLine();

        String str[] = s.split(" ");
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        int dem;

        for (int i = 0; i < str.length; i++) {
            dem = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    dem++;
                }
            }
            map.put(str[i], dem);
        }

        System.out.println("Map:");
        map.forEach((k, v) -> System.out.println(k + " : " + v));


        System.out.println("\nSX key:");
        Map<String, Integer> map1 = new TreeMap<String, Integer>(map);
        map1.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static void B3() {
        System.out.print("s: ");
        String s = scanner.nextLine();

        String str[] = s.split(" ");
        Map<String, Integer> map = new TreeMap<String, Integer>();
        int dem;

        for (int i = 0; i < str.length; i++) {
            dem = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    dem++;
                }
            }
            map.put(str[i], dem);
        }

        System.out.println("M:");
        map.forEach((k, v) -> System.out.println(k + " : " + v));


        Map<Integer, String> m = new TreeMap<Integer, String>();
        String trung;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (m.containsKey(entry.getValue())) {
                trung = m.get(entry.getValue()) + ", " + entry.getKey();
                m.put(entry.getValue(), trung);
            } else {

                m.put(entry.getValue(), entry.getKey());
            }
        }

        System.out.println("M:");
        m.forEach((k, v) -> System.out.println(k + " : " + v));
    }


    public static void main(String[] args) {
//        B1();
//        B2();
        B3();//        CHECK: c c c a a a b b b e e e d d d an lan can
    }
}
