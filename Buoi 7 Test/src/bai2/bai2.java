package bai2;

import java.util.*;
import java.util.stream.Collectors;


public class bai2 {
    static ArrayList<Book> books = new ArrayList<Book>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("1.Add book");
            System.out.println("2.Edit book by id");
            System.out.println("3.Delete book by id");
            System.out.println("4.Sort books by name (ascending)");
            System.out.println("5.Sort books by price (descending)");
            System.out.println("6.Show all books");
            System.out.println("7.Exit");
            System.out.print("Nhập lựa chọn: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBookById();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    sortNameBook();
                    break;
                case 5:
                    sortPriceBook();
                    break;
                case 6:
                    showALlBook();
                    break;
                case 7:
                    System.exit(1);
                default:
                    break;
            }
        } while (true);
    }

    // Add book
    public static void addBook() {
        Book book = new Book();
        book.Input();
        if(isContain(book.getId())) {
            System.out.println("Duplicate id");
            return;
        }
        books.add(book);
        System.out.println("Add thanh cong!!");
    }

    // Edit book by id
    public static void editBookById() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        System.out.print("Nhap id book can edit: ");
        int idEdit = sc.nextInt();
        if(!isContain(idEdit)) {
            System.out.println("Duplicate id");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == idEdit) {
                System.out.println("\tNhap thong tin muon sua: ");
                books.get(i).Edit();
            }
        }
    }

    // Delete book by id
    public static void deleteBook() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        System.out.print("Chon id book can xoa: ");
        int idDel = sc.nextInt();
        if(!isContain(idDel)) {
            System.out.println("Duplicate id");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == idDel) {
                books.remove(i);
                break;
            }
        }
    }

    // Sort by name
    public static void sortNameBook() {
//        for (int i = 0; i < books.size(); i++) {
//            for(int j = i + 1; j < books.size(); j++) {
//                if(books.get(i).getName().compareTo(books.get(j).getName()) > 0) {
//                    Collections.swap(books, i, j);
//                }
//            }
//        }
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });
    }

    // Sort by price
    public static void sortPriceBook() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            for(int j = i + 1; j < books.size(); j++) {
                if(books.get(i).getPrice() < books.get(j).getPrice()){
                    Collections.swap(books, i, j);
                }
            }
        }
    }

    // Show all
    public static void showALlBook() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        System.out.printf("%15s %15s %15s %15s %15s %15s\n", "Id", "Name", "Publisher", "Price", "Number Of Page", "Author");
        for(int i = 0; i < books.size(); i++) {
            books.get(i).Output();
        }
    }

    public static boolean isContain(int id) {
        for(Book book : books) {
            if(book.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
