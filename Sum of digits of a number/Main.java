import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sum = 0;
      int temp = 0;
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      while(n > 0){
        temp = n % 10;
        sum = sum + temp;
        n = n / 10;
      }
      System.out.println(sum);
	}
}