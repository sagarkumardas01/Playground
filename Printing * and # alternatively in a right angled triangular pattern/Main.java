import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int i,j,flag=0;
       int n = in.nextInt();
       for(i = 1; i <= n; i++){
         for(j = 1; j <= i; j++){
            if(flag == 0){
              System.out.print("*"); 
              flag=1;
            }
           else{
             System.out.print("#");
             flag=0;
           }
         }
         System.out.print("\n");
       }
    }
}