package leetcode.day_6_4;

/**
 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
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
