package LeetCodeSolutions;

/**
 * Created by AndrewX on 2017/1/14.
 * Use StringBuffer or StringBuilder if the string needs to be modified frequently.
 * StringBuilder is faster than StringBuilder. However, it is not thread-safe.
 */
public class Q38_Count_and_Say {
    public static String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        result.append('1');
        for (int i=1;i<n;i++){
            result=nextInteger(result);
        }

        return result.toString();
    }

    private static StringBuilder nextInteger(StringBuilder s){
        char current=s.charAt(0);
        int count=1;
        StringBuilder result = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==current){
                count++;
            }else{
                result.append(count);
                result.append(current);
                current=s.charAt(i);
                count=1;
            }
        }
        // don't forget the last char processed after the loop
        if (count!=0){
            result.append(count);
            result.append(current);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
