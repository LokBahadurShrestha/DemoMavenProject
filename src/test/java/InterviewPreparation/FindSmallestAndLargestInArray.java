package InterviewPreparation;


import java.util.Arrays;

public class FindSmallestAndLargestInArray {
    public static void main(String[] args) {
        int[]arr={-1,2,9,30,15, 5};

        Arrays.sort(arr);

        System.out.println(" The smallest Number= "+arr[0]);
        System.out.println("The largest Number "+arr[arr.length-1]);
        System.out.println("The largest Number "+arr[arr.length-2]);
    }
}
