package aptech.day7.exemple7;

import java.util.Scanner;

public class TinhChuViHinhChuNhat implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập cạnh thứ 1 hình chữ nhật:");
        double a = scanner.nextDouble();
        System.out.println("Vui lòng nhập cạnh thứ 2: ");
        double b = scanner.nextDouble();
        return 2 * ( a + b);
    }
}
