package aptech.day4;

import javax.swing.*;
import java.util.ArrayList;

public class MainDay4 {
    public static void main(String[] args) {
//        // collection
//        ArrayList<String> danhSachSinhvien = new ArrayList<>();
//        danhSachSinhvien.add("Hung");
//        danhSachSinhvien.add("Luyen");
//        danhSachSinhvien.add("Nhung");
//        danhSachSinhvien.add("Dao");
//        // lay ra size
//        System.out.println(danhSachSinhvien.size());
//        // xoa di phan tu tai index thu 2
//        danhSachSinhvien.remove(2);
//        // in ra size lan nua
//        System.out.println(danhSachSinhvien.size());
//
//        //foreach, duyet qua cac phan tu cua list
//        for (int i = 0; i < danhSachSinhvien.size(); i++) {
//            // lay ra phan tu tai index thu i
//            String name = danhSachSinhvien.get(i);
//            // gan gia tri ra bien name va in ra
//            System.out.println(name);
        // tao ra 1 array list student dung de chua danh sach sinh vien
        ArrayList<Student> danhSachSinhvien = new ArrayList<>();
        // Tao ra doi tuong cu the cua lop Student
        Student st1 = new Student(7,"Hung","Dao");
        //Doi tuong dua vao danh sach
        danhSachSinhvien.add(st1);
        Student st2 = new Student(8,"Chien","Dao");
        danhSachSinhvien.add(st2);
        Student st3 = new Student(9,"Qaun","Dao");
        danhSachSinhvien.add(st3);
        Student st4 = new Student(10,"Tung","Dao");
        danhSachSinhvien.add(st4);
        Student st5 = new Student(11,"Huy","Dao");
        danhSachSinhvien.add(st5);

        //Tao bie  de luu index cua phan tu tim duoc
        int searchIndex = -1;
        //Tao bien luu tu khoa tim kiem
        long searchKey = 19; //tim sinh vien co id = 19;
        // foreach , duyet qua cac phan tu cua list
        for (int i = 0; i < danhSachSinhvien.size(); i++) {
            //lay phan tu cua index thu 1
            Student student = danhSachSinhvien.get(i);
            //so sanh neu trung tu khoa
            if (student.getId() == searchKey) {
                // luu lai index cua phan tu
                searchIndex = i;
                System.out.println(searchIndex);
            }
        }
        if (searchIndex == -1) {
            System.out.println("khong tim thay sinh vien");
        } else {
            danhSachSinhvien.remove(searchIndex);
            System.out.println("Xoa thanh cong sinh vien");
        }
        for (int i = 0; i < danhSachSinhvien.size(); i++) {
            // lay ra phan tu tai index thu 1
            Student student = danhSachSinhvien.get(i);
            //gan gia tri duoc in ra
            System.out.printf("Student: %d - %s %s\n", student.getId(), student.getFirstName(),student.getLastName());
        }
    }
}
