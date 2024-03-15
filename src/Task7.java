public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        int positiveCount = 0;
        int negativeCount = 0;

        for (int k = 0; k < numbers.length; k++){
            if (numbers[k] < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println("Number of positive elements in the array is: " + positiveCount + "\nNumber of negative elements in the array is: " + negativeCount);
    }
}