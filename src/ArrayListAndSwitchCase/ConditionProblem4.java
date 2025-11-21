package ArrayListAndSwitchCase;
import java.util.*;
public class ConditionProblem4 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int print = 1;
        switch (print){
            case 1 :
                if (c == 'A'){
                    System.out.print("I am the first letter");
                    break;
                }
            case 2 :
                if (c == 'B'){
                    System.out.print("I am the second letter");
                    break;
                }
            case 3 :
                if(c == 'C'){
                    System.out.print("I am the third letter");
                    break;
                }
            case 4:
                if(c == 'D'){
                    System.out.print("I am the fourth letter");
                    break;
                }
            case 5:
                if(c == 'E'){
                    System.out.print("I am the fifth letter");
                    break;
                }
            default :
                System.out.print("I don't belong here");
        }
    }
}
