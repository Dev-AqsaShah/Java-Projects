package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getters & setters
    public String getpassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

}
public class bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "aqsa";
        account1.email = "aqsashah@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getpassword());
    }
}

