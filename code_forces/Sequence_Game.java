import java.util.*;

//1862B

public class Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            List<Integer> a = new ArrayList<>();
            a.add(b[0]);
            int m = 1;
            for(int i = 1; i < n; i++){
                if(b[i-1] <= b[i]){
                    a.add(b[i]);
                    m++;
                }
                else {
                    a.add(1);
                    a.add(b[i]);
                    m += 2;
                }
            }
            System.out.println(m);
            System.out.println(m);
            System.out.println();
        }
    }
}
