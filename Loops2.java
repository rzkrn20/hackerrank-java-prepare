import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < integer; i++) {
            String string = scanner.nextLine();
            String[] splitResult = string.split("\\s+");
            int a = Integer.parseInt(splitResult[0]);
            int b = Integer.parseInt(splitResult[1]);
            int n = Integer.parseInt(splitResult[2]);

            int result = a + b;
            for (int j = 1; j <= n; j++) {
                System.out.print(result);
                result += (Math.pow(2, j)) * b;
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}