/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

/**
 *
 * @author jan et
 */
public class Main {
    public static void main (String[] args){
        String[] month= {"Jan","Feb","Mar","Apr","May","Jun"};
        int[] amount= {2500,1600,2000,2700,3200,800};
        
        System.out.println ("===Total sale of Product A in 2016===");
        for (int i=0;i<month.length;i++){
            System.out.print( month[i]+" | ");
            int HashTag = amount[i]/100;
            for (int j=0; j<HashTag; j++){
                System.out.print ("#");
            }
            System.out.println ("("+amount[i]+")");
        }
    }
}
