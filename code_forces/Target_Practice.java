import java.util.*;

//1873C

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        int t = sc.nextInt();
        while(t-- > 0){
            char[][] ar = new char[10][10];
            for(int i = 0; i < 10; i++){
                String s = sc.next();
                for(int j = 0; j < 10; j++){
                    ar[i][j] = s.charAt(j);
                }
            }
            int tot = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    if(ar[i][j] == 'X') tot += arr[i][j];
                }
            }
            System.out.println(tot);
        }
    }
}
