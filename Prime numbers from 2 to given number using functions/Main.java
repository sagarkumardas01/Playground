import java.util.Scanner;
class Main{     
  public static void prime(int n){ 
    int num = 0,i;
for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	    System.out.println(i);
	  }	
       }
  }
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      prime(s);
	}
}