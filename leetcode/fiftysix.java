import java.util.*;

public class fiftysix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for(int i = 0; i < n; i++){
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
        }

        System.out.print(arr);
    }
    
}
