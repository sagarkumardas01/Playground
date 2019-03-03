import java.util.Scanner;
class Main{
  public static void largest(int n1,int n2,int n3){
       int b;
     if(n1 > n2){
       b=n1;
     }
    else{
    b = n2;
    }
    find(b,n3);
  }
  public static void find(int b,int n3){
    int large;
     if(b > n3){
       large=b;
     }
    else{
    large = n3;
    }
    System.out.println(large);
  }
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
      largest(n1,n2,n3);
	}
}