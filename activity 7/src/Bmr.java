import java.util.Scanner;

public class Bmr {
    public static void main(String[] args) {
        String[] strLifestyle = {"SEDENTARY (SOMEWHAT INACTIVE)",
                                "SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)",
                                "ACTIVE (EXERCISE 3-4 DAYS A WEEK)",
                                "HIGHLY ACTIVE (EXERCISE EVERYDAY)"};
        double FEMALE_FIX_WEIGHT = 4.3, FEMALE_FIX_HEIGHT = 4.7, FEMALE_FIXED_AGE = 4.7,
               MALE_FIX_WEIGHT = 6.3, MALE_FIX_HEIGHT = 12.9, MALE_FIXED_AGE = 6.8, bmr = 0, addBmr, newBmr;
        String lifestyle = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME               : ");
        String nameInput = scan.next();

        System.out.print("ENTER YOUR AGE                : ");
        int ageInput = scan.nextInt();

        System.out.print("ENTER YOUR WEIGHT (in pounds) : ");
        double weightInput = scan.nextDouble();

        System.out.print("ENTER YOUR HEIGHT (in inches) : ");
        int heightInput = scan.nextInt();

        System.out.print("ENTER YOUR GENDER             : ");
        String genderInput = scan.next();

        // bmr calculation
        if(genderInput.equalsIgnoreCase("female")) {
            bmr = 655 + (FEMALE_FIX_WEIGHT * weightInput) + (FEMALE_FIX_HEIGHT * heightInput) - (FEMALE_FIXED_AGE * ageInput);
        } else if (genderInput.equalsIgnoreCase("male")) {
            bmr = 660 + (MALE_FIX_WEIGHT * weightInput) + (MALE_FIX_HEIGHT * heightInput) - (MALE_FIXED_AGE * ageInput);
        }
        System.out.println("YOUR BMR IS                   : " + bmr + " Calories/day\n");

        // lifestyle
        System.out.print("ENTER YOUR LIFESTYLE: \n");
        for(int i = 1; i <= strLifestyle.length; i++) {
            System.out.println("\t" + i + " " + strLifestyle[i-1]);
        }
        System.out.print("ENTER YOUR LIFESTYLE          : ");
        scan.nextLine();
        lifestyle = scan.nextLine();

        switch (lifestyle) {
            case "SEDENTARY", "Sedentary":
                newBmr = bmr * 0.2;
                break;
            case "Somewhat active", "somewhat active", "SOMEWHAT ACTIVE":
                addBmr = bmr * 0.3;
                newBmr = bmr + addBmr;
                break;
            case "Active", "active", "ACTIVE":
                addBmr = bmr * 0.4;
                newBmr = bmr + addBmr;
                break;
            case "Highly active", "highly active", "HIGHLY ACTIVE":
                addBmr =  bmr * 0.5;
                newBmr = bmr + addBmr;
                break;
            default:
                addBmr = 0;
                newBmr = bmr;
                System.out.print("Enter valid input\n");
        }

        System.out.print("YOUR NEW BMR IS               : " + newBmr + " Calories/day\n");
        System.out.print("PROGRAMMED BY                 : KYLE BARCO");
    }
}
