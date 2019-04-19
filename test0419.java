/*请实现一个函数，将一个字符串中的每个空格替换成“%20”。
        例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
package lianxi0419;

public class test0419 {
    public static void main(String[] args) {
        Solution s = new Solution();
        StringBuffer str= new StringBuffer("We are Happy");
        String ss = s.replaceSpace(str);
        System.out.println(ss);
    }
}

class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str ==null){
            return null;
        }
        StringBuffer s = new StringBuffer();
        for(int i =0;i< str.length();i++){
            if(str.charAt(i)==' '){
                s.append('%');
                s.append('2');
                s.append('0');
            }else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
}