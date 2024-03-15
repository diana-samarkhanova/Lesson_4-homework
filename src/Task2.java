public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
        if (numbers.length % 2 == 0){
            for (int k = 0; k < numbers.length/2; k++){
                System.out.print(numbers[k] + " ");
            }
        } else {
            System.out.println("Length of the array is not even");
        }
    }
}
