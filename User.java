public class User {
    String username = "Ubah";
    String email = "ubah@gmail.com";
    String login() {
        if (username.equals("Ubah") && email.equals("ubah@gmail.com")) {
            return "Log in";
        } else {
            return "Couldn't log in";
        }
    }
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.login());
    }
}
