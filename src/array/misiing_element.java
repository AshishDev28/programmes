package array;
import java.util.*;
public class misiing_element {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array of size:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " +( size-1 )+" integers:");
        for(int i=1;i<size;i++){
            array[i]=scanner.nextInt();
        }
        for (int i =1;i<=size;i++){
            if (array[i]!=i){
                System.out.println("missing term "+i);
            }
        }

    }
}
/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
 Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4*/