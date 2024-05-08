import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++) {
            int tmp = (int)a.charAt(i);
            if (65 <= tmp && tmp <= 90) {
                str.append((char)(tmp + 32));
            } else if (97 <= tmp && tmp <= 122) {
                str.append((char)(tmp - 32));
            }
        }
        System.out.printf(str.toString());
    }
}