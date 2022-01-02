import java.util.Scanner;
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsByAcademy = Double.parseDouble(scanner.nextLine());
        int countOfJury = Integer.parseInt(scanner.nextLine());

        double pointsByJuryName = pointsByAcademy;

        for (int i = 0; i < countOfJury; i++) {
            String juryName = scanner.nextLine();
            double pointsByJury = Double.parseDouble(scanner.nextLine());
            double juryNameLength = (juryName.length() * pointsByJury) / 2;
            pointsByJuryName += juryNameLength;
            if (pointsByJuryName >= 1250.50){
                break;
            }
        }
        if (pointsByJuryName >= 1250.50){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,pointsByJuryName);
        }
        else {
            System.out.printf("Sorry, %s you need %.1f more!",actorName, 1250.50 - pointsByJuryName);
        }
    }
}