import java.util.Scanner;


//The calories needed for a Female to maintain her weight is:
//BMR = 655 + (4.3 x weight in pounds) + (4.7 x height in inches) – (4.7 x age in years)
//The calories needed for a Male to maintain his weight is:
//BMR = 660 + (6.3 x weight in pounds) + (12.9 x height in inches) – (6.8 x age in years)

//A typical chocolate bar will contain around 230 calories. Write a program that allows the user to input the
//gender, their weight in pounds, height in inches and age in years.
//        In addition, ask the user about her/his lifestyle, if he or she is:
//          1. Sedentary (somewhat inactive)
//          2. Somewhat active (exercise occasionally)
//          3. Active (exercise 3-4 days a week)
//          4. Highly active (exercise everyday)
//If the user is “Sedentary” then increase the calculated BMR by 20%. If the user is “Somewhat active” then
//increase the calculated BMR to 30%. If the user is “Active” then increase the BMR by 40% and increase by 50%
//        if the user is “Highly active”. Then output the new BMR value.

public class Bmr {
    public static void main(String[] args) {
        String[] strLifestyle = {"SEDENTARY (SOMEWHAT INACTIVE)",
                                "SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)",
                                "ACTIVE (EXERCISE 3-4 DAYS A WEEK)",
                                "HIGHLY ACTIVE (EXERCISE EVERYDAY)"};
        double FEMALE_FIX_WEIGHT = 4.3, FEMALE_FIX_HEIGHT = 4.7, FEMALE_FIXED_AGE = 4.7,
               MALE_FIX_WEIGHT = 6.3, MALE_FIX_HEIGHT = 12.9, MALE_FIXED_AGE = 6.8, bmr = 0, newBmr;
        String lifestyle = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME: ");
        String nameInput = scan.next();

        System.out.println("ENTER YOUR AGE: ");
        int ageInput = scan.nextInt();

        System.out.println("ENTER YOUR WEIGHT (in pounds)");
        double weightInput = scan.nextDouble();

        System.out.println("ENTER YOUR HEIGHT (in inches)");
        int heightInput = scan.nextInt();

        System.out.println("ENTER YOUR GENDER");
        String genderInput = scan.next();

        // bmr calculation
        if(genderInput == "female" || genderInput == "Female") {
            bmr = 655 + (FEMALE_FIX_WEIGHT * weightInput) + (FEMALE_FIX_HEIGHT * heightInput) - (FEMALE_FIXED_AGE - ageInput);
        } else if (genderInput == "male"  || genderInput == "Female") {
            bmr = 660 + (MALE_FIX_WEIGHT * weightInput) + (MALE_FIX_HEIGHT * heightInput) - (MALE_FIXED_AGE - ageInput);
        }
        System.out.println("YOUR BMR IS: " + bmr);

        // lifestyle
        for(int i = 1; i <= strLifestyle.length; i++) {
            System.out.println(i+ " " + strLifestyle[i]);
        }
        System.out.println("ENTER YOUR LIFESTYLE: ");
        switch (lifestyle) {
            case "SEDENTARY", "Sedentary":
                newBmr = bmr * 0.2;
                break;
        }

    }
}
