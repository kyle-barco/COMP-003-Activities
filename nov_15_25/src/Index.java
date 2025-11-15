import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int yrsInService;
        char ans;
        double bonus = 0;
        int[] arrYrsInService = {20, 25, 30, 35};


        Scanner scan = new Scanner(System.in);
        ans = scan.next().charAt(0);

        do {
            System.out.println("EMPLOYEE NUMBER: ");

            System.out.println("EMPLOYEE NAME: ");

            System.out.println("YEARS OF SERVICE: ");
            yrsInService = scan.nextInt();

            if (yrsInService == 20) {
                bonus = 20000;
            } else if (yrsInService == 25) {
                bonus = 25000;
            } else if ( yrsInService == 30) {
                bonus = 30000;
            } else if (yrsInService == 35) {
                bonus = 35000;
            } else {
                bonus = 0;
            }

        } while (ans == 'y' || ans == 'Y');
    }
}
