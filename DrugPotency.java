/*This program is about the certain of drug looses 4% of its effectiveness every month it is in storage. When its effectiveness is below 50% it is considered expired and must be discarded. 
 * Written by: Janelie S. Blanco BSCS 1A */
public class DrugPotency {
    public static void main(String[] args){
        //declaration of int and double variables
        int months = 0;
        double effectiveness = 100.0, initialFormula;  
        final double EXPIRED = 50.0;

        while (effectiveness > EXPIRED){
            System.out.println("Month: " + months + "\t Effectiveness: " + effectiveness + " %");
            initialFormula = (effectiveness * 0.04);
            effectiveness = effectiveness - initialFormula;
            months++;
        }
        System.out.println("Please be guided. Below 50% are considered EXPIRED and MUST be DISCARDED!"); //output
    }
}
