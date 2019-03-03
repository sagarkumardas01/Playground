import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int i,count=0;
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(i = 1;  count <= n; i++){
           if(i%2!=0){
             System.out.println(i);
             count = count + 1;
              if(count == n){
                break;
              }
           }
       }
	}
}