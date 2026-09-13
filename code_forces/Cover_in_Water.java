import java.util.*;

//1900A

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            boolean flag = false;
            int ans = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == '.' && i+1 < n && arr[i+1] == '.' && i+2 < n && arr[i+2] == '.') {
                    flag = true;
                    break;
                }
                if(arr[i] == '.') {
                    ans++;
                }
            }
            if(flag) {
                System.out.println(2);
            }
            else {
                System.out.println(ans);
            }
        }
    }
}
