/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner tekan = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        double fah = tekan.nextDouble();
        double cel = (fah-32)/1.8;
        System.out.printf("%.2f F in degree Celcius is %.2f C ",fah,cel);  
    }
}
