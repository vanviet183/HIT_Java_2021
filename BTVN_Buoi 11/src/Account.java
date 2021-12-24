import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account implements Comparable<Account> {
    private static FileControl file = new FileControl();
    private static List<Account> accounts = new ArrayList<>();

    static String regexUsername = "[\\w]{6,}$";
    static String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*-_=+])[A-Za-z0-9!@#$%^&*-_=+]{8,}$";
    static String regexEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    private String regexPhone = "[0-9\\+]{9,}";

    private static long idAuto = 1;
    private long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String createAt;

    private String rePassword;

    Scanner sc = new Scanner(System.in);

    public Account() {
        idAuto++;
        id = idAuto;
    }

    public Account(long id, String fullName, String username, String password, String email, String phone, String createAt) {
        idAuto++;
        this.id = idAuto;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void input() {
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();
        do {
            System.out.print("Enter username: ");
            username = sc.nextLine();
            if(checkUsername(username)) {
                System.out.println("username exist already");
            }
        } while (!checkValidation(regexUsername, username) || checkUsername(username));

        do {
            System.out.print("Enter password (exam: Abc$1234): ");
            password = sc.nextLine();
        } while (!checkValidation(regexPassword, password));

        do {
            System.out.print("Enter rePassword: ");
            rePassword = sc.nextLine();
        } while (rePassword.compareTo(password) != 0);

        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
        } while (!checkValidation(regexEmail, email));

        do {
            System.out.print("Enter phone: ");
            phone = sc.nextLine();
        } while (!checkValidation(regexPhone, phone));

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");
        createAt = formatter.format(date);
    }

    public void output() {
        System.out.println("id: " + id +
                ", full name: " + fullName +
                ", username: " + username +
                ", password: " + password +
                ", email: " + email +
                ", phone: " + phone +
                ", create at: " + createAt);
    }

    public void changePass() {
        do {
            System.out.print("Enter password (exam: Abc$1234): ");
            password = sc.nextLine();
        } while (checkValidation(regexPassword, password) == false);

        do {
            System.out.print("Enter rePassword: ");
            rePassword = sc.nextLine();
        } while (rePassword.compareTo(password) != 0);
    }

    public static boolean checkValidation(String regex, String element) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(element);
        return matcher.find();
    }

    public static boolean checkUsername(String username) {
        accounts = file.readAccountFromFile("Account.dat");
        for (Account acc : accounts) {
            if (username.compareTo(acc.getUsername()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Account o) {
        return getUsername().compareTo(o.getUsername());
    }
}
