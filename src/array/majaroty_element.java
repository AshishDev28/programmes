package array;

public class majaroty_element {
    public static void main(String[] args) {
        System.out.println("majority element");
        int[] nums={5,8,8,1,2,8,8};
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1 ;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > nums.length/2){
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
