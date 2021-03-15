import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

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