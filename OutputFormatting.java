import java.io.*;
import java.util.*;

public class OutputFormatting {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = "================================";
            while (string != null) {
                System.out.println(mappingString(string));
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("================================");
    }

    public static String mappingString(String input) {
        int indexDelimiter = input.indexOf(' ');
        if (indexDelimiter <= 0)
            return input;
        int stringLength = input.length();
        String language = input.substring(0, indexDelimiter);
        int number = Integer.parseInt(input.substring(indexDelimiter + 1, stringLength));
        String result = String.format("%-15s", language) + String.format("%03d", number);
        return result;
    }
}