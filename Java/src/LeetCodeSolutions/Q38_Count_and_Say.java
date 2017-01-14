package LeetCodeSolutions;

/**
 * Created by AndrewX on 2017/1/14.
 */
public class Q38_Count_and_Say {
    public static String countAndSay(int n) {
        String result="1";
        for (int i=1;i<n;i++){
            result=nextInteger(result);
        }
        return result;
    }

    private static String nextInteger(String s){
        char current=s.charAt(0);
        int count=1;
        String result="";
        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==current){
                count++;
            }else{
                result+=count;
                result+=current;
                current=s.charAt(i);
                count=1;
            }
        }
        // don't forget the last char processed after the loop
        if (count!=0){
            result+=count;
            result+=current;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
