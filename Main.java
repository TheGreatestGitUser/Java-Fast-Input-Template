
/*
    *   @author Joshua Persaud
    *   @since 3/14/2021
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    // here is an instance of the BufferedReader class, called "in", and it is private and static
    private static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    // here is an instance of the StringTokenizer class, called "st", and it is private and static
    private static StringTokenizer st;

    // this method is a private method that is used for taking the trimmed string from the BufferedReader class and the readLine() method, and turns it into tokens
    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    // this method is a private method that takes the input from the next() method, and uses Long.parseLong() to convert it to a long value (64 bits, 2^63 values), which is then returned
    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    // this method is a private method that takes the input from the next() method, and uses Integer.parseInt() to convert it to a int value (32 bits, 2^31 values), which is then returned
    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    // this method is a private method that takes the input from the next() method, and uses Double.parseDouble() to convert it to a double value (15 decimal places), which is then returned
    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    // this method is a private method that takes the input from the BufferedReader class and the readLine() method, trims it with trim(), and then returns the value
    private static String nextLine() throws IOException {
        return in.readLine().trim();
    }

  public static void main(String[] args) throws IOException {
      System.out.println("This is a template for fast input.");
      System.out.println("It builds off of the BufferedReader class.");
      System.out.println("If you can't remember all of this code, let's say for CP contests,");
      System.out.println("then you can do: BufferedReader in = new BufferedReader(new InputStreamReader(System.in));");System.out.println("The input comes as a string with the method: br.readLine() and you can do Integer.parseInt(in.readLine()) or Long.parseLong(in.readLine()) for integers.");
      System.out.println("For decimals, you can do Double.parseDouble(in.readLine())");
      System.out.println("\n\nPlease enter a value as a test.");
      System.out.println("You entered: " + nextLine());
  }
}