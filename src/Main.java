import leetcode.day_6_4.ZChange;

public class Main {

    public static void main(String[] args) {
        ZChange zg = new ZChange();
        String result = zg.convert("LEETCODEISHIRING", 3);
        if("LCIRETOESIIGEDHN".equals(result))
            System.out.println(result);
        else
            System.out.println("pmg error");
    }
}
