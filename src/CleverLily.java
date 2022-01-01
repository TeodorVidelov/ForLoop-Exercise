import java.util.Scanner;
public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LilyAges = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int unitPriceOfToy = Integer.parseInt(scanner.nextLine());

        int countEvenBirthDays = 0;
        int giftedMoney = 0;
        int sumMoney = 0;
        int countGiftedToys = 0;

        for (int i = 1; i <= LilyAges; i++) {
            if (i % 2 == 0){
                countEvenBirthDays++;
                giftedMoney += 10;
                sumMoney += giftedMoney;
            }
            else {
                countGiftedToys++;
            }
        }
        double soldToys = countGiftedToys * unitPriceOfToy;
        double herBrotherTake1LvEveryEvenBirthDay = countEvenBirthDays;
        double sum = sumMoney + soldToys;
        double totalSum = sum - herBrotherTake1LvEveryEvenBirthDay;

        if (sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f",totalSum - priceWashingMachine);
        }
        else {
            System.out.printf("No! %.2f",priceWashingMachine - totalSum);
        }
    }
}