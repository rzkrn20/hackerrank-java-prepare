import java.util.Scanner;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < integer; i++) {
            String string = scanner.nextLine();
            boolean isByte = false;
            boolean isShort = false;
            boolean isInt = false;
            boolean isLong = false;

            //Check byte
            try {
                Byte.parseByte(string);
                isByte = true;
            } catch (NumberFormatException e) {
                //Go to next step
            }

            //Check short
            try {
                Short.parseShort(string);
                isShort = true;
            } catch (NumberFormatException e) {
                //Go to next step
            }

            //Check int
            try {
                Integer.parseInt(string);
                isInt = true;
            } catch (NumberFormatException e) {
                //Go to next step
            }

            //Check long
            try {
                Long.parseLong(string);
                isLong = true;
            } catch (NumberFormatException e) {
                //Go to next step
            }

            if (!(isByte || isShort || isInt || isLong)) {
                System.out.println(String.format("%s can't be fitted anywhere.", string));
            } else {
                System.out.println(String.format("%s can be fitted in:", string));
                if (isByte)
                    System.out.println("* byte");
                if (isShort)
                    System.out.println("* short");
                if (isInt)
                    System.out.println("* int");
                if (isLong)
                    System.out.println("* long");
            }
        }
        scanner.close();
    }
}