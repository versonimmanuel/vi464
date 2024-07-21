import java.util.*;
class RockPaperScissor{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    Random generator = new Random();
    final int ROCK = 1;
    final int PAPER = 2;
    final int SCISSORS = 3;
    int userChoice, computerChoice; 
    do{
      System.out.println("Press 1 for Rock\nPress 2 for Paper\nPress 3 for Scissors\nPress 0 to quit");
      userChoice = console.nextInt();
      computerChoice = generator.nextInt(3) +1;

      if(userChoice == ROCK){
        if(computerChoice == ROCK){
          System.out.println("ROCK vs ROCK : TIE");
        }
        else if(computerChoice == PAPER){
          System.out.println("ROCK vs PAPER : YOU LOSE");
        }
        else if(computerChoice == SCISSORS){
          System.out.println("ROCK vs SCISSORS : YOU WIN");
        }
      }
      else if(userChoice == PAPER){
       if(computerChoice == ROCK){
           System.out.println("PAPER vs ROCK : YOU WIN");
        }
        else if(computerChoice == PAPER){
           System.out.println("PAPER vs PAPER : TIE");
        }
        else if(computerChoice == SCISSORS){
           System.out.println("PAPER vs SCISSORS : YOU LOSE");
        }
      }
      else{
        if(userChoice == SCISSORS){
          if(computerChoice == ROCK){
            System.out.println("SCISSORS vs ROCK : YOU LOSE");
          }
          else if(computerChoice == PAPER){
            System.out.println("SCISSORS vs PAPER : YOU WIN");
          }
          else if(computerChoice == SCISSORS){
            System.out.println("SCISSORS vs SCISSORS : TIE");
          }
        }
      }
    }while(userChoice > 0);
    System.out.println("Thanks for playing");
  }
}