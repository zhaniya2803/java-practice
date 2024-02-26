package Yrok_2024_02_26;

public class User {
    private  String login;
    private  String pasword;
    private  String mail;
   private int age;

    public User(String login, String pasword, String mail, int age) {
        this.login = login;
        this.pasword = pasword;
        this.mail = mail;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
