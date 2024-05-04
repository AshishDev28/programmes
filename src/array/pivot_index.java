package array;

public class pivot_index {
    public static void main(String[] args) {
        System.out.println("find pivot element");
        int[] nums={1,7,3,6,5,6};
        int sum = 0;
        for (int i =0;i<nums.length;i++){
             sum =sum+nums[i];
        }
        int leftsum =0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = sum-nums[i]-leftsum;
            if (leftsum==rightsum){
                System.out.println(i);
                System.out.println("leftsum "+leftsum);
                System.out.println("rightsum "+rightsum);
                break;
            }
            else{
                leftsum = leftsum +nums[i];
            }
        }
    }
}
