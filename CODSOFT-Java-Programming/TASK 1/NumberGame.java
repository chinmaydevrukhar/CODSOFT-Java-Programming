
//Task 1: Number Game
import java.util.*;
public class NumberGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random num= new Random();
        int min =1;
        int max =100;
        int maxAttempts = 5;
        int score =0;

       do{
           int random_num = num.nextInt(100) + min;
           int guess;
           int attempts=0;
           System.out.println("Guess a number between "+min+" and "+max+"." );
           while (attempts<maxAttempts){
               System.out.print("Enter your guess: ");
               guess = sc.nextInt();
               attempts++;
               if (guess == random_num){
                   System.out.println("Congratulations!! Your guess Correct.");
                   score = score + maxAttempts - attempts + 1;

               } else if (guess < random_num) {
                   System.out.println("Your guess is too low!! TRY  AGAIN");
               }else {
                   System.out.println("Your guess is too high!! TRY  AGAIN");
               }

           }
           String res;
           System.out.println("Do you want to play again?(yes/no): ");
           res = sc.next().toLowerCase();
           if(!res.equals("yes")){
               break;
           }
           sc.close();

       }while (true);
        System.out.println("Thank you for playing!\nYour total score is :"+score);

    }
}
