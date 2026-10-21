import java.util.Scanner;

public class patterns {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number of rows");
    n = sc.nextInt();
    System.out.println("enter number of columns");
    int m = sc.nextInt();

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= m; j++){
        System.out.print("*");
      }
      System.out.println();
    }
   
  }
}
