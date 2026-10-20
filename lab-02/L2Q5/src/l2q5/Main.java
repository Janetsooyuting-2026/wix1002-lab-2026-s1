/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author jan et
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random cincai = new Random();
        int result = cincai.nextInt(10001);
        
        System.out.println("Random number generated is"+result);
        int tt = result/10000;
        int t= (result/1000)-(tt*10);
        int h= (result/100)-(tt*100)-(t*10);
        int ten = (result/10)-(tt*1000)-(t*100)-(h*10);
        int one = (result%10);
        
        System.out.println(tt+"ten thousand\n"+t+"thousand\n"+h+"hundred\n"+ten+"ten\n"+one+"one");  
    }
}
