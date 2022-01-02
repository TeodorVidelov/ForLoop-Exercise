import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOpenTabsInBrowser =Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int fine = 0;

        for (int i = 0; i < countOfOpenTabsInBrowser; i++) {
            String website = scanner.nextLine();

            if ("Facebook".equals(website)){
                fine += 150;
            }
            else if ("Instagram".equals(website)){
                fine += 100;
            }
            else if ("Reddit".equals(website)){
                fine += 50;
            }
            if (fine >= salary){
                break;
            }
        }
        if (fine >= salary){
            System.out.println("You have lost your salary.");
        }
        else {
            System.out.printf("%d",salary - fine);
        }
    }
}