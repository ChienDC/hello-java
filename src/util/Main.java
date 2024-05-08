package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        float number1, number2, result;

        do {
            System.out.println("Chương trình máy tính.");
            System.out.println("==============");
            System.out.println("1. Tính tổng hai số.");
            System.out.println("2. Tính hiệu hai số.");
            System.out.println("3. Tính nhân hai số.");
            System.out.println("4. Tính chia hai số.");
            System.out.println("5. Kết thúc chương trình.");
            System.out.println("==============");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn (1-5):");
            choice = scanner.nextInt();

            if (choice == 5) {
                // Kết thúc chương trình nếu người dùng chọn 5
                break;
            }

            System.out.println("Vui lòng nhập số thứ 1:");
            number1 = scanner.nextFloat();
            System.out.println("Vui lòng nhập số thứ 2:");
            number2 = scanner.nextFloat();

            switch (choice) {
                case 1:
                    // Xử lý Cộng
                    result = Calculator.tinhTongHaiSo(number1, number2);
                    System.out.println("Tổng 2 số là :" + result);
                    break;
                case 2:
                    // Xử lý Trừ
                    result = Calculator.tinhHieuHaiSo(number1, number2);
                    System.out.println("Hiệu 2 số là :" + result);
                    break;
                case 3:
                    // Xử lý Nhân
                    result = Calculator.tinhNhanHaiSo(number1, number2);
                    System.out.println("Tích 2 số là :" + result);
                    break;
                case 4:
                    // Xử lý Chia
                    result = Calculator.tinhChiaHaiSo(number1, number2);
                    if (result != 0) {
                        System.out.println("Thương 2 số là :" + result);
                    } else {
                        System.out.println("Không thể chia cho 0.");
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }
}
