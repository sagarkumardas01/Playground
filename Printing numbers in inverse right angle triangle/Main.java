import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
  		int i,j,p,k;
       int n = in.nextInt(); 
       for(i = 1; i <= n; i++){
          p = (n - i) + 1;
          k = (n - i) + 1;
         for(j = 1; j <= k; j++){
           
             if(j <= k){
                System.out.print(p);
               p = p - 1;
             }
         }
        System.out.print("\n"); 
       }
	}
}