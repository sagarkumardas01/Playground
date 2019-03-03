import java.util.Scanner;
class Main
{
  
  static int m(int n1){
      int i;
    int sum =0;
       for(i=1;i<=n1;i++){
          sum = sum + i;
       }
    return sum;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s = m(n);
      System.out.println(s);
	} 
}