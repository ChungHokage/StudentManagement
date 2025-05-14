package Service;

import java.util.List;
import java.util.Scanner;
import DTOs.StudentDTO;
import DTOs.StudentRequest;

public class StudentService {
    // Method to add a new student

    Scanner scanner = new Scanner(System.in);
    IOSerivce fileService = new IOSerivce();
    String path = "D:\\Learn java\\StudentManagement\\Storage\\data.txt";

    public void addStudent() {
        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập ngành học: ");
        String major = scanner.nextLine();

        StudentRequest studentRequest = new StudentRequest(name, age, address, email, phone, gpa, major);
        System.err.println(studentRequest.toString());

    }

    // Method to update an existing student
    public void updateStudent(int id, StudentRequest studentRequest) {
        // Logic to update an existing student
    }

    // Method to delete a student
    public void deleteStudent(int id) {
        // Logic to delete a student
    }

    // Method to get a student by ID
    public StudentDTO getStudentById(int id) {
        // Logic to get a student by ID
        return null;
    }

    // Method to get all students
    public List<StudentDTO> getAllStudents() {
        // Logic to get all students
        return null;
    }
}
