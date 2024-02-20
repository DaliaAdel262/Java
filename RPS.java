import java.util.Scanner;
import java.util.Random;

///////////////////////////////////////////////////////////////////////////////////////////////////////

public class RPS {
    public static void main(String[] args){

        //Greetings :)
        System.out.println("Welcome to rock, paper, scissors game :)");

        //Variable for unlimited no of rounds
        Boolean keep_playing = true;


        while (keep_playing){

            //User input
            System.out.println("Please choose a move between rock, paper, scissors.");
            String user_move = new Scanner(System.in).nextLine();

            //If user's move is valid
            if (valid_move(user_move)){
                
                //Computer move using random
                String[] rps = {"rock","paper","scissors"};
                String comp_move = rps[new Random().nextInt(rps.length)];

                //Checking winner
                if (user_move.equalsIgnoreCase("rock") && comp_move.equalsIgnoreCase("paper")
                    || user_move.equalsIgnoreCase("paper") && comp_move.equalsIgnoreCase("scissors")
                    || user_move.equalsIgnoreCase("scissors")  && comp_move.equalsIgnoreCase("rock")){

                      System.out.println("Computer chose " + comp_move + "\nComputer wins!");

                }
                else if (user_move.equalsIgnoreCase(comp_move)){

                      System.out.println("Computer chose " + comp_move + "\nTied!");

                }
                else{

                      System.out.println("Computer chose " + comp_move + "\nYou win!");

                }

                //Checking if user wants to play again
                System.out.println("Would you like to play again? (yes or no):)");
                String choice = new Scanner(System.in).nextLine();

                if (choice.equalsIgnoreCase("yes")){

                   keep_playing = true;

                }
                else{

                   keep_playing = false;

                }
            }

            //If user's move not valid
            else if (!valid_move(user_move)){

                System.out.println("Hey! Enter a valid move >:(");

            }
            
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    //Function to check if user's move is valid
    public static Boolean valid_move(String move){
        if (move.equalsIgnoreCase("rock") 
                || move.equalsIgnoreCase("paper") 
                || move.equalsIgnoreCase("scissors")){

                return true;

            }
        else{

            return false;

        }
    }
}
