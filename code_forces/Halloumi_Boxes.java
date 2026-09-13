import java.util.*;

//1903A

public class Halloumi_Boxes {
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

            int[] a2 = new int[n];
            for(int i = 0; i < n; i++){
                a2[i] = a[i];
            }

            Arrays.sort(a);
            int f = 0;
            for(int i = 0; i < n; i++){
                if(a[i] != a2[i]) f = 1;
            }
            if(k == 1 && f == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");  
            }
        }
    }
}
