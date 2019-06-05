package leet;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Leet0604007 {
    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        String strX = "" + x * sign;
        int ret = 0;
        try {
            ret = Integer.parseInt(new StringBuffer(strX).reverse().toString()) * sign;
        }
        catch (Exception e){

        }
        return ret;
    }
}
