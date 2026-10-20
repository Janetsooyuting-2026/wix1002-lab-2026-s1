/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tekan = new Scanner(System.in);
        System.out.println("===Car-loan Monthly Payment Calculator===");
        System.out.println("");
        
        System.out.print("Enter the Car price(RM) : ");
        double P = tekan.nextDouble();
        System.out.print("Enter the Down paymment(RM) : ");
        double D = tekan.nextDouble();
        System.out.print("Enter the Annual rate(%) : ");
        double R = tekan.nextDouble();
        System.out.print("Enter the Duration(years) : ");
        int Y = tekan.nextInt();
        
        double FP = P-D;
        double FI = FP*(R/100)*Y;
        double TR = FP+FI;
        double MP = TR/(Y*12);
        
        System.out.printf("Financial Principal: RM%.2f", FP);
        System.out.printf("%nFlat Interest      : RM%.2f", FI);
        System.out.printf("%nTotal Repayment    : RM%.2f", TR);
        System.out.printf("%nMonthly payment    : RM%.2f", MP);
    }
}