package models;

public class User extends Account {
    private int userId;
    private String fullName;
    private int age;
    private String userAddress;
    private String gender;
    private String userType;
    private String vipTerm;

    public User(int userId, String fullName, int age, String phoneNumber, String userAddress, String gender, String userType, String vipTerm) {
        this.userId = userId;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.userAddress = userAddress;
        this.gender = gender;
        this.userType = userType;
        this.vipTerm = vipTerm;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getVipTerm() {
        return vipTerm;
    }

    public void setVipTerm(String vipTerm) {
        this.vipTerm = vipTerm;
    }


}
