import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int fact = 1;
        while(n > 0){
           fact = fact * n;
          n = n - 1;
        }
      System.out.println(fact);
	}
}