import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int[] nums = new int[3];

        for(int i=0; i< nums.length;i++)
        {
            System.out.print("Input Number "+counter+ " : ");
            nums[i] = input.nextInt();
            counter++;
        }
        Arrays.sort(nums);
        System.out.print("Modified array is " + Arrays.toString(nums));
    }
}