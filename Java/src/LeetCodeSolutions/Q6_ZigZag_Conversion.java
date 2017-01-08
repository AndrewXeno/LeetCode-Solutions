package LeetCodeSolutions;

/**
 * Created by AndrewX on 2017/1/8.
 */
public class Q6_ZigZag_Conversion {
    public static String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        String result=new String();
        for (int i=0;i<numRows;i++){
            for (int j=0;j<s.length();j++){
                if((j-i)%(2*numRows-2)==0 || (j+i)%(2*numRows-2)==0){
                    result=result.concat(s.substring(j,j+1));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("0123456789", 2));
    }
}
