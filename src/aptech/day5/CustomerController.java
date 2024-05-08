package aptech.day5;

import java.util.ArrayList;
import java.util.Scanner;

// làm nhiệm vụ điều hướng khách hàng nhập và hiển thị thông tin.
public class CustomerController {
    //Tạo ra nơi lưu trữ danh sách khách hàng.
    // Biến này nằm ngọài phạm vi của hàm create để được sử dụng trong các hàm khác của lớp CustomerController
    // Việc khai báo ở đây giúp dữ liệu nhập vào đc giữ lại khi gọi các hàm khác
    ArrayList<Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //1. Cho phép lưu trữ , tạo mới thông tin khách hàng.
    public void create() {

        //Yêu cầu nhập
        System.out.println("Vui lòng nhập thông tin khách hàng.");
        System.out.println("Nhập id:");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String firstName = scanner.nextLine();
        System.out.println("Nhập họ:");
        String lastName = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập phone:");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        //Tạo ra 1 đối tượng customer từ thông tin nhập vào
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setAge(age);
        // Đưa ra customer và list.
        customers.add(customer);
    }

    //2. Cho phép hiển thị.
    public void showListCustomer() {
        System.out.println("Hiển thị danh sách khách hàng.");
        System.out.println("------------------------------");
        System.out.printf("%-10s || %-30s || %-30s\n", "Id", "First Name", "Last Name");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.printf("%-10s || %-30s || %-30s\n", c.getId(), c.getFirstName(), c.getLastName());
        }
        System.out.println("Enter để tiếp tục.");
        scanner.nextLine();
    }
    //3. Cho phép thay đổi.
    //4. Cho phép xóa.
}
