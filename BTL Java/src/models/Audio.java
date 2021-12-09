package models;

import java.util.Scanner;

public class Audio {
    private int audioId;
    private String audioName;
    private double price;
    private String audioType;
    Scanner sc = new Scanner(System.in);

    public Audio(int audioId, String audioName, double price, String audioType) {
        this.audioId = audioId;
        this.audioName = audioName;
        this.price = price;
        this.audioType = audioType;
    }

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public void input() {
        System.out.print("Enter id");
    }

}
