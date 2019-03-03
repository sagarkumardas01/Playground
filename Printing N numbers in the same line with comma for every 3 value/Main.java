import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int count=0,i;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(i = 1; i <= n; i++){
      count++;
      System.out.print(i); 
      if(count % 3 == 0){
         System.out.print(",");
      }
    }
  }
}