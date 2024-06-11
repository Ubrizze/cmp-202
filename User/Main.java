package User;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Joshua Ubah";
        student.password = "Ubah@123#";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());

        //Admin
        Admin adminName = new Admin();
        adminName.name = "Joshua";
        adminName.password = "0987";
        Admin results = new Admin();
        results.uploadResults("CMP 202", 45);
        System.out.println(adminName.register());
    }
}
