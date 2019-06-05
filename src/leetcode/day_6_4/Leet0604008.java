package leet;

/**
 * Created by jafo on 19/6/4.
 */
public class Leet0604008 {
    public static int atoi(String str){
        str = str.trim();
        if(str == null || str.isEmpty()) return 0;
        if((str.charAt(0) < '0' || str.charAt(0) > '9') && str.charAt(0) != '-' && str.charAt(0) != '+'){
            return 0;
        }

        int endPos = 1;
        for(; endPos < str.length(); ++endPos){
            if(str.charAt(endPos) < '0' || str.charAt(endPos) > '9'){
                break;
            }
        }
        str = str.substring(0, endPos).trim();
        if("-".equals(str) || "+".equals(str))
            return 0;
        int ret = 0;
        try {
            ret = (int)Double.parseDouble(str);
        }catch (Exception e){
            if(str.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }

        return ret;
    }
    public static void doit(){
        System.out.println(Leet0604008.atoi("BCD 999"));
        System.out.println(Leet0604008.atoi("-999  asdf "));
        System.out.println(Leet0604008.atoi("-9999999999999  asdf "));
        System.out.println(Leet0604008.atoi("9999999999999  asdf "));
        System.out.println(Leet0604008.atoi("ad9999999999999  asdf "));
        System.out.println(Leet0604008.atoi("1Ad9999999999999  asdf "));
        System.out.println(Leet0604008.atoi("4.53"));
        System.out.println(Leet0604008.atoi("+"));
    }
}
