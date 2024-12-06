import java.util.Arrays;

class ArraySizeException extends Exception {
    ArraySizeException(String message) {
        super(message);
    }
}

public class App {

    public static int getMaxSumOfSegments(int[] numArray) {
        {

            if (numArray.length < 3) {
                return -1;
                // throw new ArraySizeException("Array Size Not Multiple of 4 and is less than
            }

            else if (numArray.length % 4 == 0) {
                int segmentSize = numArray.length / 4;
                int[] segmentSums = new int[4];

                for (int i = 0; i < 4; i++) {
                    int sum = 0;

                    for (int j = i * segmentSize; j < (i + 1) * segmentSize; j++) {
                        sum += numArray[j];
                    }
                    segmentSums[i] = sum;
                }

                Arrays.sort(segmentSums);

                return (segmentSums[3] + segmentSums[2]);
            }

            else if (numArray.length % 4 != 0 && numArray.length > 3) {

                // NEEDS TO BE FIXED:

                /*
                 * int segmentSize = numArray.length ;
                 * int[] segmentSums = new int[4];
                 * 
                 * for (int i = 0; i < 4; i++) {
                 * int sum = 0;
                 * 
                 * for (int j = i * segmentSize; j < (i + 1) * segmentSize; j++) {
                 * sum += numArray[j];
                 * }
                 * segmentSums[i] = sum;
                 * }
                 * 
                 * Arrays.sort(segmentSums);
                 * 
                 * return (segmentSums[3]);
                 */

            }

        }

        return -1;

    }

    public static void main(String[] args) throws Exception {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 4 };
        System.out.println("Max Segment of { 1, 2, 3, 4, 5, 6, 7, 4 } is: " + getMaxSumOfSegments(arr1));
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Max Segment of { 1, 2, 3, 4, 5, 6, 7} is: " + getMaxSumOfSegments(arr2));
    }
}
