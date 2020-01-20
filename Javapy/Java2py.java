/**
*created by adesa
*/

package Javapy;
import java.util.Scanner;

public class Java2py{

    public static void print(final String string) {
    System.out.println(string);
  }

  public static class input {
    /**
    Used to Print lines like python
    @param int,string,float can be used
    */
    static Scanner scan = new Scanner(System.in);

    public static String Str() {
      return scan.nextLine();
    }

    public static int Int() {
      return scan.nextInt();
    }

    public static float Flout() {
      return scan.nextFloat();
    }
  }
}
