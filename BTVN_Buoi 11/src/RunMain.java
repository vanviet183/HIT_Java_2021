import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunMain {
    public static Scanner scanner;
    public static List<Account> accounts = new ArrayList<>();
    private static FileControl file = new FileControl();

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("1. Create new account.\n"
                    + "2. Login to an existing account.\n"
                    + "3. Sort accounts by username.\n"
                    + "4. Exit.");
            System.out.print("Enter select: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    logInAccount();
                    break;
                case 3:
                    sortUsername();
                    break;
                case 4:
                    System.exit(1);
            }
        } while (true);

    }

    public static void createAccount() throws IOException {
        Account acc = new Account();
        acc.input();
        file.writeAccountToFile("Account.dat", acc);
    }


    public static boolean checkAccount(String username, String password) throws IOException {
        accounts = file.readAccountFromFile("Account.dat");
        for (Account acc : accounts) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void logInAccount() throws IOException {
        sc.nextLine();
        System.out.print("username: ");
        String username = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        if (checkAccount(username, password)) {
            System.out.println("1. Show info.\n"
                    + "2. Change password.");
            System.out.print("Enter select: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    showInfo(username, password);
                    break;
                case 2:
                    changePassword(username, password);
                    break;
                default:
                    break;
            }
        } else {
            do {
                System.out.print("The username or password you entered is incorrect, please try again.\n");
                System.out.print("username: ");
                username = sc.nextLine();
                System.out.print("password: ");
                password = sc.nextLine();
            } while (!checkAccount(username, password));
        }
    }

    public static void showInfo(String username, String password) {
        accounts = file.readAccountFromFile("Account.dat");
        for (Account acc : accounts) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                acc.output();
            }
        }
    }

    public static void changePassword(String username, String password) throws IOException {
        accounts = file.readAccountFromFile("Account.dat");
        for (Account acc : accounts) {
            if (username.compareTo(acc.getUsername()) == 0 && password.compareTo(acc.getPassword()) == 0) {
                System.out.println("Enter new password: ");
                acc.changePass();
                file.updateAccountToFile("Account.dat", accounts);
            }
        }
        System.out.println("Change password success!");
    }

    public static void sortUsername() throws IOException {
        accounts = file.readAccountFromFile("Account.dat");
        Collections.sort(accounts);
        System.out.println("List account after sort: ");
        file.updateAccountToFile("Account.dat", accounts);
        for (Account acc : accounts) {
            acc.output();
        }
    }


}





