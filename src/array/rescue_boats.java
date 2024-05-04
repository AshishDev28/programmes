package array;

import java.util.Arrays;

public class rescue_boats {
    public static void main(String[] args) {
        int[] people ={3,2,2,1};
        int limit=3;
        int boats =0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j] + people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        System.out.println(boats);
    }
}
//You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where
//each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum
//of the weight of those people is at most limit.
