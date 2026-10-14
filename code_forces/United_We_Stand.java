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
            int max =  -1;
            for(int i = 0; i < n; i++){
                if(a[i] > max) max = a[i];
            }
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            
            for(int val : a){
                if(val % max != 0){
                    b.add(val);
                }
                else{
                    c.add(val);
                }
            }
            if(b.size() == 0){
                System.out.println(-1);
            }
            else{
                System.out.println(b.size() + " " + c.size());
                for(int val : b){
                    System.out.print(val + " ");
                }
                System.out.println();
                for(int val : c){
                    System.out.print(val + " ");
                }
                System.out.println();
                
            }
        }
    }
    
}
