package aptech.day7.exemple7;

import java.util.Scanner;

public class TinhChuViHinhTamGiac implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 cạnh hình tam giác : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        return a + b + c;
    }
}