import java.util.*;

public class L3Q3 {
    public static void main(String[] args) {
        Random cincai = new Random();

        int p11 = cincai.nextInt(1,6);  
        int p12 = cincai.nextInt(1,6);
        int p21 = cincai.nextInt(1,6);
        int p22 = cincai.nextInt(1,6);

        int player1 = p11 + p12;
        int player2 = p21 + p22;

        System.out.println("Player 1 rolls " + p11 + " and " + p12 + ": " + player1);
        System.out.println("Player 2 rolls " + p21 + " and " + p22 + ": " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
