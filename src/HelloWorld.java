import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("Tôi tên là fwfewf");

        int id = 101;
        String item = "Sach";
        double cost = 145.500;
        System.out.printf("ID: %d - Ten: %s - Gia: %.3f VNĐ\n", id, item, cost);
        // Kết quả: ID: 101 - Ten: Sach - Gia: 50.00 VNĐ
        System.out.println("");
        Scanner scanner = new Scanner(System.in); //Tạo đối tượng scanner.
        System.out.println("Tên của tôi là: ");
        String name = scanner.nextLine();

        System.out.println("Tuổi: ");
        int age = scanner.nextInt();

        System.out.println("______________________");
        System.out.print("Tên của bạn là: " + name + " | " + "Tuổi: " + age);
    }
}
