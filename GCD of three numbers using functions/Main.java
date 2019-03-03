import java.util.Scanner;
public class Main{
  public static void gcd(int n1,int n2,int n3){
       int min_element;
    int gcdd=0;
      if(n1<n2){
         min_element=n1;
      }
    else{
    min_element=n2;
    }
    while(min_element>=1){
      
       if((n1%min_element==0) && (n2%min_element==0)){
          gcdd=min_element;
         break;
       }
      min_element--;
    }
    find(gcdd,n3);
  }
   public static void find(int gcdd,int n3){
       int minn_element;
     int fgcd=0;
      if(gcdd<n3){
         minn_element=gcdd;
      }
    else{
    minn_element=n3;
    }
    while(minn_element>=1){
      
       if((gcdd%minn_element==0) && (n3%minn_element==0)){
         fgcd=minn_element;
         break;
       }
      minn_element--;
    }
   System.out.println(fgcd);
  }
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      gcd(n1,n2,n3);
	}
}