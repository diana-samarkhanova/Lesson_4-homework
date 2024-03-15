public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int k = 1; k < numbers.length; k++){
            if (numbers[k] > numbers[k-1]) {
                System.out.print(numbers[k] + " ");
            }
        }
    }
}
