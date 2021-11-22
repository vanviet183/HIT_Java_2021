package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


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
//                    EditBook();
                    break;
                case 3:
                          
            }
        }
    }

    public void Input(Book a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        a.setId(sc.nextInt());
        System.out.println("Nhap ten: ");
        a.setName(sc.nextLine());
        System.out.println("Nhap nha xuat ban: ");
        a.setPublisher(sc.nextLine());
        System.out.println("Nhap gia: ");
        a.setPrice(sc.nextDouble());
        System.out.println("Nhap so trang: ");
        a.setNumberOfPage(sc.nextInt());
        System.out.println("Nhap tac gia: ");
        a.setAuthor(sc.nextLine());
    }

    // Add book
    public static void AddBook(ArrayList<Book> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.println("Nhap sach: ");
            Book book = new Book();
            Input(book);
            a.add(book);
        }
    }

    // Edit book
    public void EditBookById(ArrayList<Book> a) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon book can sua: ");
        x = sc.nextInt();
        for (int i = 0; i < a.size(); i++) {
            if(i == x) {
                do{
                    System.out.println("1.Sua id: ");
                    System.out.println();
                }
            }
        }
    }

    // Delete book
    public void DeleteBook(ArrayList<Book> a) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon book can xoa: ");
        do {
            x = sc.nextInt();
        } while(x < 0 || x > a.size());
        x = sc.nextInt();
        for (int i = x; i < a.size(); i++) {
            a.set(a.get(i), a.get(i + 1));
        }
    }

    // Sort by name
    public void SortNameBook(ArrayList<Book> a) {
        for (int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i).getName().compareTo(a.get(j).getName()) > 0) {
                    Book temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }

    // Sort by price
    public void SortPriceBook(ArrayList<Book> a) {
        for (int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i).getPrice() > a.get(j).getPrice()){
                    Book temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }

    // Show all
    public void ShowALlBook(ArrayList<Book> a) {
        for(int i = 0; i < a.size(); i++) {
            a.get(i).OutPut();
        }
    }

    public void OutPut(Book a) {
        System.out.println("Id: " + a.getId());
        System.out.println("Ten sach: " +a.getName());
        System.out.println("Nha xuat ban: " + a.getPublisher());
        System.out.println("Gia : " + a.getPrice());
        System.out.println("So trang: " +a.getNumberOfPage());
        System.out.println("Tac gia: "+a.getAuthor());
    }
}
