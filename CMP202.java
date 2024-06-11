public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 17;
        height = 186;
        name = "Ubah Joshua";
        name.length();
        password = "UbahJosh123";
        if (password.contains("123") || password.contains("Ubah")) {
            System.out.println("Password is not strong enough");
        }
    }    
}
