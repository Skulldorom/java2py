package Javapy;
import java.util.Scanner;

public class Java2py{

    public static void print(final String string) {
    System.out.println(string);
  }

  public static String input() {
      Scanner scan = new Scanner(System.in);
      return scan.next();
    }
}