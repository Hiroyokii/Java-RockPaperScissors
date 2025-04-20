import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String[] rps = {"Rock", "Paper", "Scissor"};

        System.out.print("Enter your choice (Rock, Paper, Scissor): ");
        String userChoice = input.nextLine();
        
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        String computerChoice = rps[randomIndex];
         
        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Draw!");
        } else if (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissor") ||
                   userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock") ||
                   userChoice.equalsIgnoreCase("Scissor") && computerChoice.equals("Paper")) {
                   System.out.println("You Win!");
        } else {
                System.out.println("You Lose!");
        }

    input.close();

    }
}
