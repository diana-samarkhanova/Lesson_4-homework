//max min
public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        int max = numbers[0];
        int min = numbers[0];
        for (int k = 1; k < numbers.length; k++){
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }
        System.out.println("Maximum element in the array is: " + max + "\nMinimum element in the array is: " + min);
    }
}