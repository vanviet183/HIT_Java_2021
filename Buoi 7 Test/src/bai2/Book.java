package bai2;

public class Book extends  Doccument {
    private int numberOfPage;
    private String author;

    public Book() {

    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String name, String publisher, double price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Nhap so trang: ");
        this.numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.author = sc.nextLine();
    }

    @Override
    public void Edit() {
        super.Edit();
        System.out.print("Nhap so trang: ");
        this.numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.author = sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%15s %15s\n", numberOfPage, author);
    }
}
