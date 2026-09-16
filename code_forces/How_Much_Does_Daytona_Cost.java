import java.util.*;

//1878A

public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean f = false;
            for(int i = 0; i < n; i++){
                if(a[i] == k){
                    f = true;
                    break;
                }
            }
            if(f) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    
}
