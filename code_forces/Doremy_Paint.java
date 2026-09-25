import java.util.*;

//1890A

public class Doremy_Paint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(n == 2){
                System.out.println("Yes");
                continue;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {  
               if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
               }
               else map.put(arr[i], 1); 
            }
            if(map.size() > 2) {
                System.out.println("No");
                continue;
            }
            if(map.size() == 1) {
                System.out.println("Yes");
                continue;
            }
            List<Integer> val = new ArrayList<>(map.values());
            if(Math.abs(val.get(0)-val.get(1)) > 1) {
                System.out.println("No");
            }
            else System.out.println("Yes");
        }
    }
}
