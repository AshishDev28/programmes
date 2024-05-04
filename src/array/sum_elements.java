package array;

public class sum_elements {
    public static void main(String[] args) {
        int[] numbers = {5, 498, 4, 9846, 498, 465, 984, 48};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        System.out.println("sum of elements of array is : "+sum);
        }

}
