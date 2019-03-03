import java.util.Scanner;
 class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		int i,j,p,k,m=1;
       int n = in.nextInt(); 
       for(i = 1; i <= n; i++){
         boolean c = true;
         p = (n - i) + 1;
         k = n + (i - 1);
         for(j = 1; j <= k; j++){
           
             if(j >= p && j <= k && c){
                System.out.print(m);
                c = false;
               m = m + 1;
             }
           else{
              System.out.print(" ");
              c = true;
           }
         }
        System.out.print("\n"); 
       }
	}
}