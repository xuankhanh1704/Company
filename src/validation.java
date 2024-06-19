import java.util.InputMismatchException;
import java.util.Scanner;

public class validation {


    public static int inputInt(){
        Scanner sc = new Scanner(System.in);

        int a;
        while(true){
            try{
                sc = new Scanner(System.in);
                 a = sc.nextInt();
                return a;
            }catch(Exception e){
                System.out.println("Enter an integer!!!");
            }

        }
    }
}
