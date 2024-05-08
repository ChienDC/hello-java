package aptech.day3;

public class Product {
    long id;
    String slug;
    String name;
    double price;

    void showInformation(){
        System.out.println("Thông tin sản phẩm.");
        System.out.println("ID: " + id);
        System.out.println("Slug: " + slug);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
