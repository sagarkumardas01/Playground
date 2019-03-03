import java.util.Scanner;
class Main
{
  static int m(int n1){
     return n1 * n1;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s = m(n);
      System.out.println(s);
	} 
}