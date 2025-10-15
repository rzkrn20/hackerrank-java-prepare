import java.util.Scanner;

public class StdinStdoutII4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String integer = scanner.nextLine();
        String d = scanner.nextLine();
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + Double.parseDouble(d));
        System.out.println("Int: " + Integer.parseInt(integer));
    }
}
