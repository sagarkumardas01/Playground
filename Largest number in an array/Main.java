import java.util.Scanner;
class Main{
    public static void main(String args[]){
      int i,flag=0,largest=0;
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[6];
       for(i=0;i<arr_size;i++){
          arr[i]=in.nextInt();
       }
      for(i=0;i<arr_size;i++){
         if(largest<arr[i]){
           largest=arr[i];
         }
       }
      System.out.println(largest);
    }
}