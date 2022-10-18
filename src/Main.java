public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 3, -9, 4, -29, 50, -34, -32};
        getEvenNumbers(numbers);
    }

    private static void getEvenNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + "\t- парне число");
            }
        }
    }
}