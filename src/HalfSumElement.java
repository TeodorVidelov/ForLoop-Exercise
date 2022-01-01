import java.util.Scanner;
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        int sumWithoutMaxNumber = sum - maxNumber;
        if (maxNumber == sumWithoutMaxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d",maxNumber);
        }
        else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(maxNumber - sumWithoutMaxNumber));
        }
    }
}