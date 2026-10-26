import java.util.*;

public class L3Q4 {
    public static void main(String[] args) {
        System.out.println("===Solve Simultaneous Eqn Using Cramer's Rule=== ");
        System.out.println("ax+by=e");
        System.out.println("cx+dy=f");

        Scanner tekan = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = tekan.nextInt();
        System.out.print("Enter value of b : ");
        int b = tekan.nextInt();
        System.out.print("Enter value of c : ");
        int c = tekan.nextInt();
        System.out.print("Enter value of d : ");
        int d = tekan.nextInt();
        System.out.print("Enter value of e : ");
        int e = tekan.nextInt();
        System.out.print("Enter value of f : ");
        int f = tekan.nextInt();

        double denominator = (a*d)-(b*c);
        /* d -b
          -c  a */
        if (denominator==0){
            System.out.println("No solution.");
        }else{
            double determinant= 1.0/denominator;
            double x = determinant * (d*e+(-b*f));
            double y = determinant * ((-c*e)+a*f);
            System.out.printf("Value of x is %.2f \n",x);
            System.out.printf("Value of y is %.2f",y);
        }
    }
}
