import java.util.Scanner;

import DTOs.StudentRequest;
import Service.StudentService;

public class StudentManagement {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        StudentService studentService = new StudentService();
        while (running) {
            displayMenu();
            System.out.print("Nhập lựa chọn (1, 2, 3, 5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": {
                    studentService.addStudent();
                    break;
                }

            }
        }

        scanner.close();
    }

    static void displayMenu() {
        System.out.println("\n===================== MENU ==================");
        System.out.println("1. Chế độ 1");
        System.out.println("2. Chế độ 2");
        System.out.println("3. Chế độ 3");
        System.out.println("5. Thoát");
    }

    static void displayStudentInfo() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("1. Tên: ");
        System.out.println("2. Ngày sinh: ");
        System.out.println("3. Địa chỉ: ");
        System.out.println("4. Email: ");
        System.out.println("5. Số điện thoại: ");
        System.out.println("6. Điểm trung bình: ");
        System.out.println("7. Chuyên ngành: ");
    }

    static void displayStudentList() {
        System.out.println("Danh sách sinh viên:");
        System.out.println("1. Sinh viên 1");
        System.out.println("2. Sinh viên 2");
        System.out.println("3. Sinh viên 3");
        System.out.println("4. Sinh viên 4");
        System.out.println("5. Sinh viên 5");
    }

    static void displayStudentDetails() {
        System.out.println("Chi tiết sinh viên:");
        System.out.println("1. Tên: ");
        System.out.println("2. Ngày sinh: ");
        System.out.println("3. Địa chỉ: ");
        System.out.println("4. Email: ");
        System.out.println("5. Số điện thoại: ");
        System.out.println("6. Điểm trung bình: ");
        System.out.println("7. Chuyên ngành: ");
    }

    static void displayStudentUpdate() {
        System.out.println("Cập nhật thông tin sinh viên:");
        System.out.println("1. Tên: ");
        System.out.println("2. Ngày sinh: ");
        System.out.println("3. Địa chỉ: ");
        System.out.println("4. Email: ");
        System.out.println("5. Số điện thoại: ");
        System.out.println("6. Điểm trung bình: ");
        System.out.println("7. Chuyên ngành: ");
    }

    static void displayStudentDelete() {
        System.out.println("Xóa thông tin sinh viên:");
        System.out.println("1. Tên: ");
        System.out.println("2. Ngày sinh: ");
        System.out.println("3. Địa chỉ: ");
        System.out.println("4. Email: ");
        System.out.println("5. Số điện thoại: ");
        System.out.println("6. Điểm trung bình: ");
        System.out.println("7. Chuyên ngành: ");
    }

    static void displayStudentSearch() {
        System.out.println("Tìm kiếm sinh viên:");
        System.out.println("1. Tên: ");
        System.out.println("2. Ngày sinh: ");
        System.out.println("3. Địa chỉ: ");
        System.out.println("4. Email: ");
        System.out.println("5. Số điện thoại: ");
        System.out.println("6. Điểm trung bình: ");
        System.out.println("7. Chuyên ngành: ");
    }

    public static void addNewStudent() {

    }
}
