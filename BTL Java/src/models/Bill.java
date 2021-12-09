package models;

import models.Audio;

import java.util.List;

public class Bill {
    private int billID;
    private String dateOfPurchase;
    private String userNameOfBill;
    private List<Audio> audioBought;

    public Bill(int billID, String dateOfPurchase, String userNameOfBill, List<Audio> audioBought) {
        this.billID = billID;
        this.dateOfPurchase = dateOfPurchase;
        this.userNameOfBill = userNameOfBill;
        this.audioBought = audioBought;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getUserNameOfBill() {
        return userNameOfBill;
    }

    public void setUserNameOfBill(String userNameOfBill) {
        this.userNameOfBill = userNameOfBill;
    }
    public List<Audio> getAudioBought() {
        return audioBought;
    }

    public void setAudioBought(List<Audio> audioBought) {
        this.audioBought = audioBought;
    }
}
