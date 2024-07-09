package iteration;
public class Iteration {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int totalSum = 0;

        for (int number : numbers) {
            totalSum += number;
        }
        System.out.println("The sum of the numbers is: " + totalSum);
    }
}
