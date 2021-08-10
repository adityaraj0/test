import java.util.*;
public class sim { 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = sc.nextInt();
        int[] arr= new int [n];
        System.out.println("Enter the element");
        for (int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=n-1;i>0;i--){
           System.out.println(arr[i]);
        } 
    }  
}
}
