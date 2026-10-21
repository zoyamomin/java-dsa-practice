import java.util.Scanner;

public class Loops {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num == 1){
      do{
        int marks = sc.nextInt();
        if(marks >= 90){
          System.out.println("This is Good");
        }else if(marks >= 60){
          System.out.println("This is also good");
        }else {
          System.out.println("this is good as well");
        }
      }while(num == 0);
    }else {
      System.out.println("stop");
    }

  }
}
