package BaiTapThucHanh;

import java.util.Scanner;

public class Bai2 {

    public static boolean isPrimeNumber(int n) {
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

    public static int tongChuSo(int n) {
        int T = 0;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return T;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        System.out.println("Nhap s = ");
        s = scanner.nextInt();
        int count = 0;
        System.out.println("Liet ke tat ca so nguyen to co 5 chu so: ");
        for (int i = 10001; i < 99999; i += 2) {
            if (isPrimeNumber(i)) {
                if (tongChuSo(i) == s)
                    System.out.println(i);
                count++;
            }
        }


    }
}
