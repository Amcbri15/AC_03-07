package nyc.c4q.Amcbri15;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/7/15.
 */
public class FortuneTeller {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String question;


        System.out.println("What would you like to know about your destiny? ");
        question = in.nextLine();

        int randomVal = new Random().nextInt(4);

        if(randomVal == 0){
            System.out.println("Absolutely!");
        }
        else if(randomVal == 1){
            System.out.println("The future looks bleak...");
        }
        else if(randomVal == 2){
            System.out.println("Maaaaaybe..");
        }
        else{
            System.out.println("Absolutely not!");
        }
    }
}
