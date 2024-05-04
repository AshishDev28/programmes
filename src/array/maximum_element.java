package array;

public class maximum_element {
    public static void main(String[] args) {
        int[] numbers = {8,9,5,96,5,8,5,69};
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }

        }
        System.out.println("maximum element ="+max);

    }
}
