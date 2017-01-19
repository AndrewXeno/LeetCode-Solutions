package LeetCodeSolutions;

import java.util.Arrays;

/**
 * Created by AndrewX on 2017/1/19.
 * For each house, compare its distances with the currentHeater and the next one. If next heater is nearer, replace
 * the current one with the next one. Pay attention to the boundary condition.
 * To sort an array, use in-place sort: Arrays.sort().
 */
public class Q475_Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius=0, currentHeater=0;
        for(int i=0;i<houses.length;i++){
            while (currentHeater<heaters.length-1
                    && Math.abs(houses[i]-heaters[currentHeater])>=Math.abs(houses[i]-heaters[currentHeater+1])){
                currentHeater++;
            }
            radius=Math.max(radius, Math.abs(houses[i]-heaters[currentHeater]));
        }
        return radius;
    }
}
