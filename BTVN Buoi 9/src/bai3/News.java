package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private List<Integer> rateList = new ArrayList<>(3);

    Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + getTitle() +
                ", publishDate: " + getPublishDate() +
                ", author: " + getAuthor() +
                ", content: " + getContent() +
                ", averageRate: " + getAverageRate());
    }

    public void Calculate() {
        int sum = rateList.stream().mapToInt(e -> e).sum();
        averageRate = sum / 3;
    }

    public void Input() {
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter publishDate: ");
        publishDate =  sc.nextLine();
        System.out.print("Enter author: ");
        author = sc.nextLine();
        System.out.print("Enter content: ");
        content = sc.nextLine();
        System.out.println("Enter rateList: ");
        rateList.add(sc.nextInt());
        rateList.add(sc.nextInt());
        rateList.add(sc.nextInt());
    }

}
