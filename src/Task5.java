public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        int thirdend = numbers.length - 3;
        for (int k = thirdend; k < numbers.length; k++){
            System.out.print(numbers[k] + " ");
        }
    }
}