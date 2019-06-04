package leetcode.day_6_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 请你实现这个将字符串进行指定行数变换的函数：
 */
public class ZChange {
    public String convert(String s, int numRows) {
       if(1 == numRows) return s;
       List<StringBuilder> builders = new ArrayList<>();
       for(int i = 0; i < Math.min(numRows, s.length()); ++i){
           builders.add(new StringBuilder());
       }
       int cur = 0;
       boolean go = false;
       for(char c : s.toCharArray()){
           builders.get(cur).append(c);
           if(0 == cur || numRows - 1 == cur){
               go = !go;
           }
           cur += go ? 1 : -1;
       }
       StringBuilder sb = new StringBuilder();
       for(StringBuilder lsb : builders){
           sb.append(lsb);
       }
       return sb.toString();
    }
}
