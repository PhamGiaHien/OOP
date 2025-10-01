import java.util.Scanner;
import java.util.HashSet;

public class StringCode {
    String blowup (String str){
        StringBuilder res = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len - 1; i++){
            char now = str.charAt(i);

            if (Character.isDigit(now) && Character.isLetter(str.charAt(i + 1))){
                if (Character.isDigit(str.charAt(i - 1))){
                    res.append(now);
                }
                int digit = now - '0';
                for (int j = 0; j < digit; j++){
                    res.append(str.charAt(i + 1));
                }
            }
            else if (Character.isLetter(now)){
                res.append(now);
            }
        }
        if (Character.isLetter(str.charAt(len-1))){
            res.append(str.charAt(len-1));
        }
        return res.toString();
    }

    int maxRun (String str){
        int len = str.length();
        int update = 0;
        int cnt = 1;

        for (int i = 0; i < len  - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                cnt++;
            }
            else {
                cnt = 1;
            }
            if (cnt > update){
                update = cnt;
            }
        }
        return update;
    }

    boolean stringIntesect(String a, String b, int len){
        HashSet <String> set = new HashSet<>();
        for (int i = 0; i < a.length() - len; i++){
            set.add(a.substring(i, i + len));
        }

        for (int i = 0; i < b.length(); i++){
            if (set.contains(b.substring(i, i + len))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String m = input.nextLine();

        StringCode s1 = new StringCode();
        System.out.println(s1.blowup(s));

        System.out.println(s1.maxRun(s));

        System.out.println(s1.stringIntesect(s, m, 2));
    }
}
