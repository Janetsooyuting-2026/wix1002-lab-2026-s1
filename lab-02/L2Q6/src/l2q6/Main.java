/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tekan = new Scanner (System.in);
        
        System.out.print("Water mass (g) : ");
        double M = tekan.nextDouble();
        System.out.print("Initial temperature (F) : ");
        double it = tekan.nextDouble();
        System.out.print("Final temperature (F) : ");
        double ft = tekan.nextDouble();
        
        double MiKG = M/1000;
        double itiC = (it-32)/1.8;
        double ftiC = (ft-32)/1.8;
        double Q = MiKG*(ftiC-itiC)*4184;
        
        System.out.println("Mass in kg : "+MiKG);
        System.out.println("Initial Temperature in Celcius : "+itiC);
        System.out.println("Final Temperature in Celcius : "+ftiC);
        System.out.printf("Energy : %.6e",Q);
    }   
}
