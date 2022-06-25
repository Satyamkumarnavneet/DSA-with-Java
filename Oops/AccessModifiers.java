package Oops;

class Account {
    String name;
    protected String email;
    private String password;
    // getter & setters
    public String getPassword(){
        return this.password;
    }

    public void setpassword(String pass){
        this.password = pass;
    }


}


public class AccessModifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Satyam kumar navneet";
        account1.email = "navneetsatyamkumar@gmail.com";
        account1.setpassword("Shweta!!");
        System.out.println(account1.getPassword());
    }
}
