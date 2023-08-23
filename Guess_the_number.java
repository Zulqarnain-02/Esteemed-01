//file to creat a Random Number
import java.util.Random; 
//file to get input from user
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {
        System.out.println("Lets Play Game");
        System.out.println("I'm Thinking number between 1 to 10 \n You Have to Guess What Number I Have Think Of");
     int attempt=3;
     int doloop;
        do{
            System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        Random rd=new Random(); //Random Number

        int UserGuess=sc.nextInt(); 
        int CompterGuess= rd.nextInt(10);//Assinging into integer
        //conditions
        if (UserGuess==CompterGuess) {
            //outputs
            System.out.println("You Win");
            System.out.println("i think number "+ CompterGuess);
            System.out.println("Game over");
            break;
            
        }
        else
        attempt--;
        System.out.println("you lose");
        System.out.println("i think number "+ CompterGuess);
        System.out.println("you have remaining "+attempt+" attempts");
        System.out.println("Enter 00 to try again");
   
        doloop=sc.nextInt();
 
   if(attempt==0){
    System.out.println("Game Over");
    break;
   }
    }while(doloop==00);
}
}
