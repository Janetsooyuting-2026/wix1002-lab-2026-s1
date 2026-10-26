import java.util.*;

public class L3Q1{
    public static void main (String[]args){
        
        Scanner tekan = new Scanner (System.in);
        System.out.print("Enter Integer 1 : ");
        int n1 = tekan.nextInt();
        System.out.print("Enter Integer 2 : ");
        int n2 = tekan.nextInt();

        System.out.print("Enter the operand (+,-,*,/,%) : ");
        char op = tekan.next().charAt(0);

        switch (op){
            case '+':
                System.out.print("Result : "+n1+"+"+n2+"="+(n1+n2));
                break;
            case '-':
                System.out.print("Result : "+n1+"-"+n2+"="+(n1-n2));
                break;
            case '*':
                System.out.print("Result : "+n1+"*"+n2+"="+(n1*n2));
                break;
            case '/':
                if (n2==0){
                    System.out.print("Cannot divide by 0"); // <--- 这里补上了分号
                }
                else{
                    System.out.print("Result : "+n1+"/"+n2+"="+(n1/n2));
                }
                break;
            case '%':
                if (n2==0){
                    System.out.print("Cannot divide by 0"); // <--- 这里补上了分号
                }
                else{
                    System.out.print("Result : "+n1+"%"+n2+"="+(n1%n2));
                }
                break;
            default:
                System.out.print("Invalid operator");
        }
    }
}