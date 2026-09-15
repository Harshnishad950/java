import java.util.*;

//1896A

public class Jagged_Swaps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean f = true;
            if(arr[n-1] != n){
                f = false;
            }
            if(f) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    
}