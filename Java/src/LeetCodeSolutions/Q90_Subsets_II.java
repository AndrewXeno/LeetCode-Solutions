package LeetCodeSolutions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AndrewX on 2017/1/8.
 */
public class Q90_Subsets_II {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length==0){
            result.add(new ArrayList<Integer>());
            return result;
        }else{
            int[] prefix = Arrays.copyOfRange(nums, 0, nums.length-1);
            result = subsetsWithDup(prefix);
            List<List<Integer>> prefixSubset = subsetsWithDup(prefix);
            for(List<Integer> list: prefixSubset){
                list.add(nums[nums.length-1]);
                if (!result.contains(list)){
                    result.add(list);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 2};
        System.out.println(subsetsWithDup(num));
    }
}
