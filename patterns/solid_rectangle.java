
import java.util.*;

public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
