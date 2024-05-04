package array;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for(int i =0 ;i<nums.length;i++){
            int a = nums[i];
            for (int j=1;j<nums.length;j++){
                if(a+nums[j]==target){
                    System.out.println(a+" "+nums[j]);
                }
            }
        }
    }
}
