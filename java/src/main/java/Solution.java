import java.io.*;
import java.util.*;
public class Solution {
        //bài java list/data struce của hacker rank
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Integer> l = new LinkedList<>();
       for(int i = 0; i < n;i++){
        l.add(sc.nextInt());
       }
       int m = sc.nextInt();
       for(int i = 0; i < m;i++){
        String str = sc.next();
        if(str.equalsIgnoreCase("Insert")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            l.add(x,y);
        }
        if(str.equalsIgnoreCase("Delete")){
            int x = sc.nextInt();
            l.remove(x);
        }
       }
       for (int num : l) {
            System.out.print(num + " ");
        }
       sc.close();
    }
}
