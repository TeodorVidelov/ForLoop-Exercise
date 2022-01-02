import java.util.Scanner;
public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroupsOfClimbers = Integer.parseInt(scanner.nextLine());

        int Musala = 0;
        int MonBlanc = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;
        int totalPeople = 0;

        for (int i = 0; i < countGroupsOfClimbers; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5){
                Musala += peopleInGroup;
            }
            else if (peopleInGroup >= 6 && peopleInGroup <= 12 ){
                MonBlanc += peopleInGroup;
            }
            else if (peopleInGroup >= 13 && peopleInGroup <= 25){
                Kilimanjaro += peopleInGroup;
            }
            else if (peopleInGroup >= 26 && peopleInGroup <= 40){
                K2 += peopleInGroup;
            }
            else if (peopleInGroup >= 41){
                Everest += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%\n",(Musala * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(MonBlanc * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(Kilimanjaro * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(K2 * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(Everest * 1.0 / totalPeople) * 100);
    }
}