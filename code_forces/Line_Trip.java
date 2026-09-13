import java.util.*;

//1901A

public class Line_Trip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int curr = 0;
            for(int i =0; i < n-1; i++){
                curr = arr[i+1] - arr[i];
                max = Math.max(max, curr);
            }
            max = Math.max(max, (x-arr[n-1])*2);
            max = Math.max(max, arr[0]-0);
            System.out.println(max);
        }

    }
}
