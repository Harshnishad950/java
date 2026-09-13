
import java.util.*;

public class hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();

        for(int i = 0; i < l; i++){
            for(int j = 0; j < w; j++){
                if( i == 0 || i == l-1 || j == 0 || j == w-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
