package ArrayListAndSwitchCase;
import  java.util.*;
public class SwitchCaseProblem1 {
    public static void main(String[] args)  throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int print = 1;

        switch (print){
            case 1:
                if(N == 55){
                    System.out.print("Study is important");
                    break ;
                }
            default :
                System.out.print("No value");
                break;
        }
    }
}
