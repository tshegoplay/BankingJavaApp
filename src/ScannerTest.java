import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        System.out.print("Enter Character: ");
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        char c = scanner.next().charAt(0);
        System.out.println("value = " +c);
    }
}