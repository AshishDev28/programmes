package array;

public class sorted_array {
    public static void main(String[] args) {
        int[] numbers ={2,3,4,5,6,7,8,9};
        int c=0;
        for(int i=0;i< numbers.length-1;i++){
            if (numbers[i]<numbers[i+1]){
                c=c+1;
                continue;
            }
            else {
                System.out.println("Not sorted ");
                break;}}
        if(c== numbers.length-1){
            System.out.println("array is sorted");
        }
    }
}
