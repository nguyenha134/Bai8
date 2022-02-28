package BaiTapThucHanh;

import java.util.Scanner;

public class VongLap {
    public static long giaiThua(int n) {
        if (n > 0) {
            return n * giaiThua(n - 1);
        } else {
            return 1;
        }

    }

    public static void soDuongLe(int n) {
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
    }

    public static void timUocSo(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkNT(int n) {
        if (n < 2) {
            return false;
        }
        int flag = (int) Math.sqrt(n);
        for (int i = 2; i <= flag; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n = ");
        n = scanner.nextInt();
        System.out.println("Giai thua cua " + n + " = " + giaiThua(n));
        System.out.println("Cac so nguyen le nho hon " + n + " la: ");
        soDuongLe(n);
        System.out.println("Uoc so cua " + n + " la: ");
        timUocSo(n);
        if (checkNT(n))
            System.out.println(n + " la so nguyen to!");
        else
            System.out.println(n + " khong la so nguyen to!");

        System.out.println("Tat ca cac so nguyen nho hon " + n + " la: ");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (checkNT(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
