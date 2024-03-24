/*This program asks the user for the interest rate, the initial investment, and the annual contribution. The program prints out the current value 
 *of the investment at the end of each year and continues until it reaches or exceeds one million dollars.
 *Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;
public class DollarsAfterForty{

    public static void main( String[] args ){
        double dollars = 0.0;
        double rate, initalInvestment, annualContribution;
        int year =  1 ;     
        Scanner scan = new Scanner( System.in );

        //prompts the user for interest rate, initial investmnt & annual contri
        System.out.print("Enter the interest rate in percent: "); 
        rate = scan.nextDouble()/100.0 ;
        System.out.print("Enter Initial Investment: "); 
        initalInvestment = scan.nextDouble();
        System.out.print("Enter Annual Contribution: ");
        annualContribution = scan.nextDouble();

        dollars = initalInvestment;

        while (dollars < 1000000){
            if (dollars > 1000000)
                break; //exit loop when exceed 1M
            else{
                dollars += dollars * rate; 
                dollars += annualContribution;
                System.out.println("After " + year + " years, the investment value is $" + dollars); //output
                year++;
            }
        }
        scan.close();
    }
}