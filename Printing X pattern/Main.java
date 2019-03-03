import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int i,j,count;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    count = n * 2 - 1;

    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
            if(i==j || (j==n - i - 1))
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
        }

        System.out.print("\n");
    }

	}
}