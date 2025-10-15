import java.io.*;

import static java.util.stream.Collectors.joining;


public class IfElse3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(mappingResult(N));

        bufferedReader.close();
    }

    public static String mappingResult (int n){
        if(n%2 != 0){
            return "Weird";
        } else if (n >= 2 && n <= 5){
            return "Not Weird";
        } else if (n >= 6 && n <= 20){
            return "Weird";
        }
        return "Not Weird";
    }
}
