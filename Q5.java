
class UserBean {
    private String password;

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set successfully.");
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        UserBean u = new UserBean();

        u.setPassword("Java123");
        System.out.println("Stored password: " + u.getPassword());
    }
}
