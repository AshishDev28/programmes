package array;

public class minimum_element {
    public static void main(String[] args) {
        int[] numbers = {8,9,5,96,5,8,5,69};
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }

        }
        System.out.println("minimum element ="+min);

    }
}
