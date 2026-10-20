/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random cincai = new Random();
        
        int n1 = cincai.nextInt(41)+10;
        int n2 = cincai.nextInt(10,51);
        int n3 = cincai.nextInt(41)+10;
        int sum = n1+n2+n3;
        double average = sum/3;
        
        System.out.printf("Number generated are %d, %d and %d.",n1,n2,n3);
        System.out.println("");
        System.out.println("Sum of three numbers are "+sum);
        System.out.printf("Average is %.1f",average);
    }
}