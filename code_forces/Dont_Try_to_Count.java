import java.util.*;

//1881A

public class Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int c = 0;
            boolean f = false;
            while(c <= 6){
                if(x.contains(s)){
                    f = true;
                    break;
                }
                else{
                    x = x + x;
                    c++;
                }  
            }
            if(f) System.out.println(c);
            else System.out.println(-1);
        }
    }
}
