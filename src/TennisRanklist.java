import java.util.Scanner;
public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  countOfTournaments = Integer.parseInt(scanner.nextLine());
        int initialPointsInRankings = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int countWin = 0;

        for (int i = 0; i < countOfTournaments; i++) {
            String result = scanner.nextLine();

            if ("W".equals(result)){
                totalPoints += 2000;
                countWin++;
            }
            else if ("F".equals(result)){
                totalPoints += 1200;
            }
            else if ("SF".equals(result)){
                totalPoints += 720;
            }
        }
        double averagePointsEarned = Math.floor(totalPoints * 1.0  / countOfTournaments);
        double percentWonTournaments = (countWin * 1.0 / countOfTournaments) * 100;
        System.out.printf("Final points: %d\n",totalPoints + initialPointsInRankings);
        System.out.printf("Average points: %.0f\n",averagePointsEarned);
        System.out.printf("%.2f%%",percentWonTournaments);
    }
}