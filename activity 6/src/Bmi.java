import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double CONVERTVAL = 0.45359237, FTinM = 0.3048, INCHinM = 0.0254, bmi;

        System.out.print("Enter Your weight in pounds: ");
        Scanner scan = new Scanner(System.in);
        double weightInPounds = scan.nextDouble();
        System.out.print("Enter your height in feet followed\n");

        System.out.print("By a space then additional inches: ");
        double heightInFeet = scan.nextDouble();
        double heightInInches = scan.nextDouble();

        // convert pound to kilogram
        double kgWeight = weightInPounds * CONVERTVAL;

        // height in feet (
        double mHeight = heightInFeet * FTinM + heightInInches * INCHinM;

        // bmi calculation
        bmi = kgWeight / Math.pow(mHeight, 2);
        double roundedBmi = Math.ceil(bmi * 100.0) / 100.0;

        // category
        String category = (bmi < 18.5)
                        ? "Underweight" : (bmi < 25)
                        ? "Normal weight" : (bmi < 30)
                        ? "Overweight" : (bmi >= 30)
                        ? "Obese": "Enter a valid input" ;
        System.out.println("Your BMI is: " + roundedBmi);
        System.out.println("Your risk category is : " + category);

        System.out.println("\nPROGRAMMED BY: : KYLE BARCO");
    }
}