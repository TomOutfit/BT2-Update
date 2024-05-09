package demoscanner;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập địa chỉ của bạn: ");
        String diachi = sc.nextLine();
        System.out.println("Hãy nhập Sđt của bạn: ");
        double phone = Double.parseDouble(sc.nextLine());
        System.out.println("Hãy nhập chuyên ngành của bạn: ");
        String major = sc.nextLine();
    }
}