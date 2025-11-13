import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double CONVERTVAL = 0.45359237, FTinM = 0.3048, INCHinM = 0.0254, mass, height, bmi;
        String categoryArr[] =  {"Underweight", "Normal weight", "Overweight", "Obese"};


        System.out.print("Enter Your weight in pounds: ");
        Scanner scan = new Scanner(System.in);
        double weightInPounds = scan.nextDouble();
        System.out.print("Enter your height in feet followed\n");

        System.out.print("By a space then additional inches: ");
        double heightInFeet = scan.nextDouble();
        double heightInInches = scan.nextDouble();


        // *** bmi calculation ***
        // convert pound to kilogram
        double kgWeight = weightInPounds * CONVERTVAL;

        // height in feet (
        double mHeight = heightInFeet * FTinM + heightInInches * INCHinM;

        // bmi value
        bmi = kgWeight / Math.pow(mHeight, 2);

        // *** choosing category ***
        for()

        System.out.println("Your bmi is: " + bmi);
    }
}
