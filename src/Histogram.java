import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                n1++;
            }
            else if (number >= 200 && number <= 399 ){
                n2++;
            }
            else if (number >= 400 && number <= 599){
                n3++;
            }
            else if (number >= 600 && number <= 799){
                n4++;
            }
            else if (number >= 800){
                n5++;
            }
        }
        System.out.printf("%.2f%%\n",(n1 * 1.0 / countNumbers) * 100);
        System.out.printf("%.2f%%\n",(n2 * 1.0 / countNumbers) * 100);
        System.out.printf("%.2f%%\n",(n3 * 1.0 / countNumbers) * 100);
        System.out.printf("%.2f%%\n",(n4 * 1.0 / countNumbers) * 100);
        System.out.printf("%.2f%%",(n5 * 1.0 / countNumbers) * 100);
    }
}