package leetcode.day_6_4;

/**
 * Created by jafo on 19/6/4.
 */
public class Leet0604009 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String str = ""+x;
        int len = str.length();
        int cnt = len / 2;
        int pos = len - 1;
        char[] arys = str.toCharArray();
        for(int i = 0; i < cnt; ++i){
            if(arys[i] == arys[pos - i])
                continue;
            else
                return false;
        }

        return true;
    }
    public static void doit(){
        System.out.println(Leet0604009.isPalindrome(1));
        System.out.println(Leet0604009.isPalindrome(0));
        System.out.println(Leet0604009.isPalindrome(122));
        System.out.println(Leet0604009.isPalindrome(-121));
        System.out.println(Leet0604009.isPalindrome(121));
        System.out.println(Leet0604009.isPalindrome(1221));
        System.out.println(Leet0604009.isPalindrome(-1));
        System.out.println(Leet0604009.isPalindrome(13231));

    }
}
