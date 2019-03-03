import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      int index,sum=0,sum1=0;
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0;i < size;i++){
        arr[i]=in.nextInt();
      
      }
       int val = in.nextInt();
      for(int i=0;i<size;i++){
         
        for(index=i+1;index<size;index++){
          sum1 = arr[i];
           sum = sum1+arr[index];
          if(sum==val){
             System.out.println(arr[i]+","+" "+arr[index]);     
          }
        }
      }
    }
}
