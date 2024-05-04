package array;

public class move_zeros_to_end {
    public static void main(String[] args) {
        System.out.println("Program to move all zeros to end from array!!");
        int[] nums={0,1,0,3,12};
        for(int num:nums){
            System.out.print(num +" ");
        }
        System.out.println();
        int nz=0;
        int z=0;
        while(nz<nums.length){
            if(nums[nz] != 0){
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }
        else {
            nz++;
            }
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }

    }
}
