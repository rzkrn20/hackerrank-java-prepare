import java.util.Scanner;

public class StdinStdout2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        scanner.close();

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
    }
}