import java.util.Scanner;
class Main{
  
  static void ma(int n,int m){
      double f=Math.pow(n,m);
      System.out.println(f);
  }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int base = in.nextInt();
      int exponent = in.nextInt();
      ma(base,exponent);
      
    }
  
}