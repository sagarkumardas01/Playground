import java.util.Scanner;
class Main{
    public static void main(String args[]){
      int i,flag=0;
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[6];
       for(i=0;i<arr_size;i++){
          arr[i]=in.nextInt();
       }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      for(i=0;i<arr_size;i++){
         if(search_elem_1==arr[i]){
            System.out.println(i);
           flag=flag+1;
         }
         else if(search_elem_2==arr[i]){
            System.out.println(i);
           flag=flag+1;
         }
       }
      if(flag!=2){
        System.out.println(-1);
      }
    }
}