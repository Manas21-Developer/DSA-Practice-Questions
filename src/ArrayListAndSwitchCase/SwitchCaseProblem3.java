package ArrayListAndSwitchCase;
import java.util.*;
public class SwitchCaseProblem3 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int print = 1;
        switch (print){
            case 1 :
                if (a%b == 0){
                    System.out.print("Remainder is too small");
                    break;
                }
            case 2 :
                if (a%b == 1){
                    System.out.print("Remainder is small");
                    break;
                }
            case 3 :
                if(a%b == 2){
                    System.out.print("Remainder is large");
                    break;
                }
            default :
                System.out.print("Remainder is too large");
        }
    }
}
