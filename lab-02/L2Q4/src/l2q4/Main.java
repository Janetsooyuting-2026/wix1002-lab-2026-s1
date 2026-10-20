/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tekan = new Scanner(System.in);
        System.out.print("Enter the time in seconds : ");
        int ts = tekan.nextInt();
        int hour = ts/3600;
        int min = (ts%3600)/60;
        int sec = ts%60;
        
        System.out.printf("The time is %d hours %d minutes %d seconds",hour,min,sec);
    }
}