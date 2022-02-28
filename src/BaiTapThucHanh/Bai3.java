package BaiTapThucHanh;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static int DEC_10 = 10;

    public static boolean isThuanNghich(int n) {
        List<Integer> listNumbers = new ArrayList<>();
        //Phan tich so n thanh cac chu so va luu vao listNumbers
        do {
            listNumbers.add(n % DEC_10);
            n = n / DEC_10;
        } while (n > 0);
        //Kiem tra tinh thuan nghich
        int size = listNumbers.size();
        for (int i = 0; i < (size / 2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean nguyento(int n) {
        while (n != 0) {
            if (!Bai2.isPrimeNumber(n % 10))
                return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Liet ke tat ca so nguyen to co 5 chu so: ");
        for (int i = 22223; i < 7777777; i += 2) {
            if (Bai2.isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }

        //Thuat nghich
        System.out.println("Liet cac so thuan nghich la: ");
        for (int i = 22223; i < 7777777; i += 2) {
            if (isThuanNghich(i)) {
                System.out.println(i);
                count++;
            }
        }

        //Moi chu so deu la nguyen to
        System.out.println("Liet cac chu so deu la nguyen to: ");
        for (int i = 22223; i < 7777777; i += 2) {
            if (nguyento(i)) {
                System.out.println(i);
                count++;
            }
        }


    }
}
