import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i,largest=0,index=0;
    int arr[]=new int[10];
    for(i=0;i<n;i++){
       arr[i]=in.nextInt();
    }
    for(i=0;i<n;i++){
      if(largest<arr[i]){
        largest = arr[i];
        index=i;
      }
    }
    System.out.println(index);
  }
}