import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNext()) {
            System.out.println(String.format("%d %s", i, scanner.nextLine()));
            i++;
        }
        scanner.close();
    }
}