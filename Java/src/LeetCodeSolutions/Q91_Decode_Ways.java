package LeetCodeSolutions;

/**
 * Created by AndrewX on 2017/1/12.
 */
public class Q91_Decode_Ways {
    public static int numDecodings(String s) {
        if (s.length()==0){
            return 0;
        }
        int[] result= new int[s.length()+1];
        /*
            result[0] is # ways for an empty substring
            result[i] indicate the # ways for the substring up to index i(excluded i)
         */
        result[0]=1;
        result[1]=s.charAt(0)=='0'?0:1;
        for (int i=2;i<s.length()+1;i++){
            int value =0;
            if(s.charAt(i-1)!='0'){
                value+=result[i-1];
            }
            if(Integer.parseInt(s.substring(i-2,i))>=10 && Integer.parseInt(s.substring(i-2,i))<=26){
                value+=result[i-2];
            }
            result[i]=value;
        }
        return result[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("10"));
    }
}
