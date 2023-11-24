import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] locations = {2, 3, 4}; //locations of cargo
        int[] weights = {150, 250, 313}; //weights of cargo

        int attemps = 1;
        boolean isNumberSame = false;
        int rightGuess = 0;


        while(attemps <= 5){
            System.out.println("Attemps: " + attemps + " \nEnter the kilometer marks to check cargo location: ");
            int[] numbers = guessNumbers();

            //This loop for check your guesses with the real locations of cargo.
            for (int i = 0; i < locations.length; i++) {
                for(int j = 0; j < numbers.length; j++){
                    if(locations[i] != numbers[j]){
                        continue;
                    }
                    else{
                        isNumberSame = true;
                        rightGuess++;
                    }
                }

            }
            if(isNumberSame && rightGuess == 3){
                System.out.println("You guessed " + rightGuess + " kilometers marks. \nYou have found the cargo.");
                break;
            }
            else{
                System.out.println("You guessed " + rightGuess + " kilometers marks");
                rightGuess =  0;
            }
            attemps++;

        }



    }
    //This method for print 3 numbers of kilometer marks to check where they are.
    public static int[] guessNumbers(){
        Scanner scanner = new Scanner(System.in);
        int guess1 = scanner.nextInt();
        int guess2 = scanner.nextInt();
        int guess3 = scanner.nextInt();
        return new int[]{guess1, guess2, guess3};

    }

}