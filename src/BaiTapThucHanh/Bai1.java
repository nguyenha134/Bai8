package BaiTapThucHanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        //Kiem tra neu listNumbers trong thi add n vao listNumbers
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        System.out.printf("Ket qua: %d = ", n);
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size - 1));

    }
}
