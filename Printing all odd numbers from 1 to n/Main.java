import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int i;
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
       for(i = 1; i <= n; i++){
         if(i % 2 != 0){
           System.out.println(i);
         }
       }
	}
}