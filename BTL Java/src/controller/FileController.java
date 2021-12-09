package controller;

import models.*;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController{
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    Scanner sc = new Scanner(System.in);

    public void OpenFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch(IOException e) { // catch all IOExceptions not handled by previous catch blocks
            e.printStackTrace();
        }
    }

    public void CloseFileAfterWrite(String fileName) {
        try {
            fileWriter.close();
            bufferedWriter.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void OpenFileToRead(String fileName) {
        try {
            sc = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CloseFileAfterRead(String fileName) {
        sc.close();
    }

    // Account
    public void WriteAccountToFile(String fileName, Account acc) {
        OpenFileToWrite(fileName);
        printWriter.println(
                acc.getId() + "|" + acc.getUserName() + "|" +
                acc.getPassword() + "|" + acc.getEmail() + "|" +  acc.getPhoneNumber()+ "|" +
                acc.getCreateAt()
        );
        CloseFileAfterWrite(fileName);
    }

    // Convert String to number
    public Account CreateAccountFromData(String data) {
        String[] arr = data.split("\\|"); // Cắt chuỗi tại điểm chung
        Account acc = new Account(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5]);
        return acc;
    }

    public List<Account> ReadAccountFromFile(String fileName) {
        OpenFileToRead(fileName);
        List<Account> list = new ArrayList<>();
        while (sc.hasNext()) { // hasNext(): có phần tử tiếp theo hay không
            String data = sc.nextLine();
            Account acc = CreateAccountFromData(data);
            list.add(acc);
        }
        CloseFileAfterRead(fileName);
        return list;
    }

    public void UpdateAccountFile(List<Account> list, String fileName) {
        File file = new File(fileName);
        if(file.exists()) {
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Account acc : list) {
            printWriter.println(
                    acc.getId() + "|" + acc.getUserName() + "|" +
                    acc.getPassword() + "|" + acc.getEmail() + "|" +  acc.getPhoneNumber()+ "|" +
                    acc.getCreateAt()
            );
        }
        CloseFileAfterWrite(fileName);
    }

    // Audio
    public void WriteAudioToFile(String fileName, Audio audio) {
        OpenFileToWrite(fileName);
        printWriter.println(
                audio.getAudioId() + "|" + audio.getAudioName() + "|" +
                audio.getPrice() + "|" + audio.getAudioType()
        );
        CloseFileAfterWrite(fileName);
    }

    public Audio CreateAudioFromData(String data) {
        String[] arr = data.split("\\|");
        Audio audio = new Audio(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), arr[3]);
        return audio;
    }

    public List<Audio> ReadProductsFromFile(String fileName){
        List<Audio> list = new ArrayList<>();
        OpenFileToRead(fileName);
        while(sc.hasNext()){
            String data = sc.nextLine();
            Audio audio = CreateAudioFromData(data);
            list.add(audio);
        }
        CloseFileAfterRead(fileName);
        return list;
    }

    public void UpdateAudioFile(List<Audio> list, String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for(Audio audio : list){
            printWriter.println(
                    audio.getAudioId() + "|" + audio.getAudioName() + "|" +
                    audio.getPrice() + "|" + audio.getAudioType()
            );
        }
        CloseFileAfterWrite(fileName);
    }

    // Bill
    public void WriteBillToFile(String fileName, Bill bill) {
        OpenFileToWrite(fileName);
        String tmpBill = "";
        tmpBill += bill.getBillID() + "*" + bill.getDateOfPurchase() + "*" + bill.getUserNameOfBill();
        for(Audio audio : bill.getAudioBought()) {
            String tmp = audio.getAudioId() + "|" + audio.getAudioName() + "|" + audio.getPrice() + "|" + audio.getAudioType();
            tmp += "*" + tmp;
        }
        printWriter.println(tmpBill);
        CloseFileAfterWrite(fileName);
    }

    public Bill CreateBillFromData(String data) {
        String[] arr = data.split("\\*");
        List<Audio> list = new ArrayList<>();
        for (int i = 3; i < arr.length; i++) {
            Audio audio = CreateAudioFromData(arr[i]);
            list.add(audio);
        }
        Bill bill = new Bill(Integer.parseInt(arr[0]), arr[1], arr[2], list);
        return bill;
    }

    public List<Bill> ReadBillsFromFile(String fileName) {
        List<Bill> list = new ArrayList<>();
        OpenFileToRead(fileName);
        while (sc.hasNext()) {
            String data = sc.nextLine();
            Bill bill = CreateBillFromData(data);
            list.add(bill);
        }
        CloseFileAfterRead(fileName);
        return list;
    }

    public void UpdateBillFile(List<Bill> list, String fileName) {
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Bill bill : list) {
            String billUpdate = bill.getBillID() + "*" + bill.getDateOfPurchase() + "*" + bill.getUserNameOfBill();
            List<Audio> listAudio = bill.getAudioBought();
            for (Audio e : listAudio) {
                billUpdate += "*" + e.getAudioId() + "|" + e.getAudioName() + "|" + e.getPrice() +
                "|" + e.getAudioType();
            }
            printWriter.println(billUpdate);
        }
        CloseFileAfterWrite(fileName);
    }

    // User
    public void WriteUserToFile(String fileName, User user) {
        OpenFileToWrite(fileName);
        printWriter.println(
                user.getUserId() + "|" + user.getFullName() + "|" + user.getAge() + "|" + user.getPhoneNumber() +
                "|" + user.getUserAddress() + "|" + user.getGender() + "|" + user.getUserType() + "|" + user.getVipTerm()
        );
        CloseFileAfterWrite(fileName);
    }

    public User CreateUserFromData(String data) {
        String[] arr = data.split("\\|");
        User user = new User(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7]);
        return user;
    }

    public List<User> ReadUserFromFile(String fileName) {
        List<User> list = new ArrayList<>();
        OpenFileToRead(fileName);
        while (sc.hasNext()) {
            String data = sc.nextLine();
            User user = CreateUserFromData(data);
            list.add(user);
        }
        CloseFileAfterRead(fileName);
        return list;
    }

    // Category
    public void WriteCategoryToFile(String fileName, Category category) {
        OpenFileToWrite(fileName);
        String tmpCategory = "";
        tmpCategory += category.getCategoryId() + "*" + category.getCategoryName();
        for (Audio audio : category.getAudioOfCategory()) {
            String tmp = audio.getAudioId() + "|" + audio.getAudioName() + "|" +
                    audio.getPrice() + "|" + audio.getAudioType();
            tmpCategory += "*" + tmp;
        }
        printWriter.println(tmpCategory);
        CloseFileAfterWrite(fileName);
    }

    public Category CreateCategoryFromData(String data) {
        String[] arr = data.split("\\|");
        List<Audio> list = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            Audio audio = CreateAudioFromData(arr[i]);
            list.add(audio);
        }
        Category category = new Category(Integer.parseInt(arr[0]), arr[1], list);
        return category;
    }

    public List<Category> ReadCategoriesFromFile(String fileName) {
        List<Category> list = new ArrayList<>();
        OpenFileToRead(fileName);
        while (sc.hasNext()) {
            String data = sc.nextLine();
            Category category = CreateCategoryFromData(data);
            list.add(category);
        }
        CloseFileAfterRead(fileName);
        return list;
    }

    public void UpdateCategoryFromFile(List<Category> list, String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Category category : list) {
            String categoryUpdate = category.getCategoryId() + "*" + category.getCategoryName();
            List<Audio> listAudio = category.getAudioOfCategory();
            for (Audio e : listAudio) {
                categoryUpdate += "*" + e.getAudioId() + "|" + e.getAudioName() + "|" +
                        e.getPrice() + "|" + e.getAudioType();
            }
            printWriter.println(categoryUpdate);
        }
        CloseFileAfterRead(fileName);
    }


}

