//print even numbers on [1, 3, 5, ..., n] indexes
public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int k = 1; k < numbers.length; k++){
            if (k%2 != 0) {
                System.out.print(numbers[k] + " ");
            }
        }
    }
}