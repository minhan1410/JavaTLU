import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int Bai1(int n) {
        int dem = 0, le = 1, sum = 0;
        while (dem < n) {
            sum += le;
            dem++;
            le += 2;
        }
        return sum;
    }

    public static boolean Bai2(int n) {
        String s = n + "";
        int star = 0, end = s.length() - 1;
        while (star < end) {
            if (s.charAt(star) != s.charAt(end)) {
                return false;
            }
            star++;
            end--;
        }
        return true;
    }

    public static boolean Bai3(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Bai4(int n) {
        String so[] = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
        String dv[] = { "nghìn", "trăm", "mươi", "" };

        int a = 1000, b = 0;
        while (n > 0) {
            if (b == 2) {
                dv[b] = "linh";
                so[0] = "";
            }
            System.out.print(so[n / a] + " " + dv[b] + " ");
            b++;
            n %= a;
            a /= 10;
        }
        System.out.println();
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void Bai5(int a, int b) {
        System.out.println("UCLN(" + a + "," + b + ") = " + UCLN(a, b));
        System.out.println("BCNN(" + a + "," + b + ") = " + BCNN(a, b));
    }

    public static void Bai6(int n) {
        int dem = 0, chay = 2;
        while (dem < n) {
            if (Bai3(chay)) {
                System.out.printf("%d, ", chay);
                dem++;
            }
            chay++;
        }
        System.out.println();
    }

    public static void Bai7() {
        int n, d, min, max, sum;
        d = sum = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("n= ");
            n = scanner.nextInt();
            if (n != 0) {
                d++;
                sum += n;
                min = Math.min(min, n);
                max = Math.max(max, n);
            } else {
                break;
            }
        }

        System.out.printf("Min= %d, Max= %d, AVG= %.2f\n", min, max, (float) (sum) / d);
    }

    public static void Bai8(int n) {
        int b = 1, kb = 1024 * b, mb = 1024 * kb, gb = 1024 * mb;
        int d_b = 0, d_kb = 0, d_mb = 0, d_gb = 0;

        System.out.print(n + " bytes= ");
        while (n > 0) {
            if (n > gb) {
                d_gb = n / gb;
                n %= gb;
            } else if (n > mb) {
                d_mb = n / mb;
                n %= mb;
            } else if (n > kb) {
                d_kb = n / kb;
                n %= kb;
            } else if (n > b) {
                d_b = n / b;
                n %= b;
            } else {
                break;
            }
        }
        System.out.println(d_gb + "GB + " + d_mb + "MB + " + d_kb + "KB + " + d_b + "Byte");
    }

    public static void Bai9(int n) {
        int s = 1, p = 60 * s, h = 60 * p, ngay = 24 * h, nam = 365 * ngay;
        int d_s = 0, d_p = 0, d_h = 0, d_ngay = 0, d_nam = 0;

        System.out.print(n + " giây= ");
        while (n > 0) {
            if (n > nam) {
                d_nam = n / nam;
                n %= nam;
            } else if (n > ngay) {
                d_ngay = n / ngay;
                n %= ngay;
            } else if (n > h) {
                d_h = n / h;
                n %= h;
            } else if (n > p) {
                d_p = n / p;
                n %= p;
            } else if (n > s) {
                d_s = n / s;
                n %= s;
            } else {
                break;
            }
        }
        System.out.println(d_nam + "nam + " + d_ngay + "ngay + " + d_h + "h + " + d_p + "p + " + d_s + "s");
    }

    public static double Bai10(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1 / (double) (2 * i));
        }
        return sum;
    }

    public static int MinBai11(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        return min;
    }

    public static int MaxBai11(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int[] SortBai11(int a[]) {
        int tam = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
        return a;
    }

    public static void Bai11() {
        System.out.print("n= ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Min= " + MinBai11(a) + " Max= " + MaxBai11(a));
        System.out.print("Sort: ");
        SortBai11(a);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.println();
    }

    public static int Bai12(String str) {
        str=str.trim();
        String s[] = str.split(" ");
        int dem=0;
        for (int i = 0; i < s.length; i++) {
            if(!(s[i].equals(null)||s[i].equals("")||s[i].equals("\t")||s[i].equals("\n"))){
                dem++;
                System.out.print(s[i]);
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        // System.out.println(Bai2(12345321));
        // System.out.println(Bai3(14));
        // Bai4(4500);
        // Bai5(10,3);
        // Bai6(5);
        // Bai7();
        // Bai8(1_075_838_977);
        // Bai9(1_075_838_977);
        // System.out.printf("%.2f",Bai10(3));
        // Bai11();
        // System.out.println(Bai12("\n\n\t\n\n\n       \n     Hoc\n\n \tjava \ntu co       ban \tden         nang\n cao \n"));
    }
}
