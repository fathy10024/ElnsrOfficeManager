package model;

public class Employee {

    private String fullName;
    private String userName;
    private String passWord;

    // ================= GETTERS =================

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    // ================= SETTERS =================

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    // ================= METHODS =================

    public void logIn(String userName, String passWord) {

    }

    public void logOut() {

    }
}