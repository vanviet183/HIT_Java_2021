package models;

import controller.FileController;

public class Account {
    protected int id;
    protected String userName;
    protected String password;
    protected String phoneNumber;
    protected String email;
    protected String createAt;

    public Account() {

    }

    public Account(int id, String userName, String password, String phoneNumber, String email, String createAt) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

//    public int getIdAccountMax() {
//        FileController fileControler = new FileController();
//    }
}
