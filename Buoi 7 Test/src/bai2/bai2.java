package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;


public class bai2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Add book");
            System.out.println("2.Edit book by id");
            System.out.println("3.Delete book by id");
            System.out.println("4.Sort books by name (ascending)");
            System.out.println("5.Sort books by price (descending)");
            System.out.println("6.Show all books");
            System.out.println("7.Exit");
            System.out.print("Nhập lựa chọn: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    AddBook(books);
                    break;
                case 2:
                    EditBookById(books);
                    break;
                case 3:
                    DeleteBook(books);
                    break;
                case 4:
                    SortNameBook(books);
                    break;
                case 5:
                    SortPriceBook(books);
                    break;
                case 6:
                    ShowALlBook(books);
                    break;
                case 7:
                    System.exit(1);
                default:
                    break;
            }
        } while (true);
    }

    public static void Input(Book a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        a.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten: ");
        a.setName(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        a.setPublisher(sc.nextLine());
        System.out.print("Nhap gia: ");
        a.setPrice(sc.nextDouble());
        System.out.print("Nhap so trang: ");
        a.setNumberOfPage(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap tac gia: ");
        a.setAuthor(sc.nextLine());
    }

    // Add book
    public static void AddBook(ArrayList<Book> a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong muon add: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("\tNhap sach " + (i + 1) + ": ");
            Book book = new Book();
            Input(book);
            a.add(book);
        }
        System.out.println("Add thanh cong!!");
    }

    // Edit book by id
    public static void EditBookById(ArrayList<Book> a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id book can sua: ");
        int idEdit = sc.nextInt();
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId() == idEdit) {
                dem++;
                System.out.println("\tNhap thong tin muon sua: ");
                Input(a.get(i));
            }
        }
        if(dem > 0) {
            System.out.println("Danh sach books sau khi sua: ");
            ShowALlBook(a);
        } else {
            System.out.println("Books ko co idBook " + idEdit);
        }
        
    }

    // Delete book by id
    public static void DeleteBook(ArrayList<Book> a) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon id book can xoa: ");
        int idDel = sc.nextInt();
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId() == idDel) {
                dem++;
                a.remove(i);
                break;
            }
        }
        if(dem > 0) {
            System.out.println("Danh sach books sau khi xoa");
            ShowALlBook(a);
        } else {
            System.out.println("Books ko co idBook " + idDel);
        }
    }

    // Sort by name
    public static void SortNameBook(ArrayList<Book> a) {
        for (int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i).getName().compareTo(a.get(j).getName()) > 0) {
                    Collections.swap(a, i, j);
                }
            }
        }
        System.out.println("Danh sach books sau khi sap xep: ");
        ShowALlBook(a);
    }

    // Sort by price
    public static void SortPriceBook(ArrayList<Book> a) {
        for (int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i).getPrice() < a.get(j).getPrice()){
                    Collections.swap(a, i, j);
                }
            }
        }
        System.out.println("Danh sach books sau khi sap xep: ");
        ShowALlBook(a);
    }

    // Show all
    public static void ShowALlBook(ArrayList<Book> a) {
        System.out.printf("%15s %15s %15s %15s %15s %15s\n", "Id", "Name", "Publisher", "Price", "Number Of Page", "Author");
        for(int i = 0; i < a.size(); i++) {
            OutPut(a.get(i));
        }
    }

    public static void OutPut(Book a) {
        System.out.printf("%15s %15s %15s %15s %15s %15s\n", a.getId(), a.getName(), a.getPublisher(), a.getPrice(), a.getNumberOfPage(), a.getAuthor());
    }

}
