
import java.util.Scanner;
import java.text.NumberFormat;
public class MortgagePayment
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Principle amount: ");
        float principle = sc.nextFloat();

        System.out.println("Your annual interest rate: : ");
        float annualInterestRate = sc.nextFloat();
        float monthlyInterestRate = annualInterestRate/100/12;


        System.out.println("Number of years: ");
        int years = sc.nextInt();
        int noOfPayments = years*12;


        sc.close();

        double payment = Math.pow(1 + monthlyInterestRate, noOfPayments);

        double monthlyPayment = principle*(monthlyInterestRate*payment/(payment-1));
        String paymentFormat = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Your monthly payment is: " + paymentFormat);





    }
}
