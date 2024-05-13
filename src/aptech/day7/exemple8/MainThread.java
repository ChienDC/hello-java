package aptech.day7.exemple8;

public class MainThread {
    public static void main(String[] args) {
        // Khởi tạo các hình
        Square square = new Square(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(3);

        // Tính toán và hiển thị kết quả
        System.out.println("Diện tích và chu vi của hình vuông:");
        displayResult(square);

        System.out.println("\nDiện tích và chu vi của hình tam giác:");
        displayResult(triangle);

        System.out.println("\nDiện tích và chu vi của hình chữ nhật:");
        displayResult(rectangle);

        System.out.println("\nDiện tích và chu vi của hình tròn:");
        displayResult(circle);
    }

    // Hiển thị kết quả diện tích và chu vi của hình
    private static void displayResult(ShapeUtility shape) {
        System.out.println("Diện tích: " + shape.calculateArea());
        System.out.println("Chu vi: " + shape.calculatePerimeter());
    }
}
