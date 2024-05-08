package aptech.day3;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductController {

    ArrayList<Product> productArrayList = new ArrayList<>();

    //1. Cho phép nhập sản phẩm
    public void createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập thông tin sản phẩm : ");
        Product product1 = new Product();
        System.out.println("Nhập id:");
        product1.id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập slug cho sản phẩm:");
        product1.slug = scanner.nextLine();
        System.out.println("Nhập tên cho sản phẩm :");
        product1.name = scanner.nextLine();
        System.out.println("Nhập giá cho sản phẩm :");
        product1.price = scanner.nextDouble();
        productArrayList.add(product1);
        System.out.println("Lưu dữ liệu thành công.");
    }

    public void showListProduct() {
        for (int i = 0; i < productArrayList.size(); i++) {
            Product p1 = productArrayList.get(i);
            System.out.println(p1.id + "\t" + p1.slug + "\t" + p1.name);
        }
    }
}
