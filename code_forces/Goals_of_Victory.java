import java.util.*;

//1877A

public class Goals_of_Victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n-1];
            int neg = 0;
            int pos = 0;
            for(int i = 0; i < n - 1; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n-1; i++){
                if(a[i] > 0) pos = pos + a[i];
                else neg = neg + a[i];
             }
            int ans = Math.abs(neg) - pos;
            System.out.println(ans);
        }
    }
}
