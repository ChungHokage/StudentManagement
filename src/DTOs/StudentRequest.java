package DTOs;

public class StudentRequest {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private double gpa;
    private String major;

    public StudentRequest() {
    }

    public StudentRequest(String name, int age, String address, String email, String phone, double gpa,
            String major) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override

    public String toString() {
        return "{name:" + name + ", age:" + age + ", address:" + address + ", email:" + email
                + ", phone:" + phone + ", gpa:" + gpa + ", major:" + major + "}";
    }

}
