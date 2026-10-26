import java.util.*;

public class L3Q2 {
    public static void main(String[] args) {
        Random cincai = new Random();
        int num = cincai.nextInt(6);

        switch (num) {
            case 0:
                System.out.println(num+" is Zero.");
                break;
            case 1:
                System.out.println(num+" is One.");
                break;
            case 2:
                System.out.println(num+" is Two.");
                break;
            case 3:
                System.out.println(num+" is Three.");
                break;
            case 4:
                System.out.println(num+" is Four.");
                break;
            default:
                System.out.println(num+" is Five.");
                break;
        }
    }
}
