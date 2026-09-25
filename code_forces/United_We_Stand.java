import java.util.*;

//1859A
 
public class United_We_Stand {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int q = 0;
            for(int i = 1; i < n; i++){
                if(a[i-1] != a[i]) q = 1;
            }
            if(q == 0){
                System.out.println(-1);
                continue;
            }
            int e = 0;
            int o = 0;
            for(int i = 0; i < n; i++){
                if(a[i] % 2 == 0) e = 1;
                if(a[i] % 2 != 0) o = 1;
            }
            Arrays.sort(a) 
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(n < n/2) b.add(a[i]);
                if(n > n/2) c.add(a[i]);
            }
            System.out.println(b.size() + " " + c.size());
            for(int x : b){
                System.out.print(x + " ");
            }
            System.out.println();
            for(int x : c){
                System.out.print(x + " ");
            }
            System.out.println();
            for(int x : c){
                System.out.print(x + " ");
            }
            System.out.println();
            for(int x : c){
                System.out.print(x + " ");
            }
            System.out.println();
            for(int x : c){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}
