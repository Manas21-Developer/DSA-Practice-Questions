package ArrayListAndSwitchCase;
import java.util.*;
public class SwitchCaseProblem2 {
    public static void main(String args[]) throws Throwable{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int print =1;

        switch (print){

            case 1:
                if (N == 12){
                    System.out.print("I am even");
                    break;
                }
            case 2 :
                if (N == 13){
                    System.out.print("I am prime");
                    break;
                }
            case 3:
                if (N == 25){
                    System.out.print("I am odd");
                    break;
                }
            default :
                System.out.print("I am just a number");
        }
    }
}
