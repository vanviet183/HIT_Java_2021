package bai3;

import java.util.ArrayList;

public class ClassRoom {
    private String idClassRoom;
    private String nameClassRoom;
    private String dateOpen;
    private ArrayList<Student> x = new ArrayList<>();
    private int n;
    private String teacher;

    public ClassRoom() {

    }

    public String getIdClassRoom() {
        return idClassRoom;
    }

    public void setIdClassRoom(String idClassRoom) {
        this.idClassRoom = idClassRoom;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public void setNameClassRoom(String nameClassRoom) {
        this.nameClassRoom = nameClassRoom;
    }

    public String getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(String dateOpen) {
        this.dateOpen = dateOpen;
    }

    public ArrayList<Student> getX() {
        return x;
    }

    public void setX(ArrayList<Student> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
