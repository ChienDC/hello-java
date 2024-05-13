package aptech.day7.exemple7;

import java.util.Scanner;

public class TinhChuViHinhVuong implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 cạnh hình vuông ");
        double a = scanner.nextDouble();
        return a * 4;
    }
}
