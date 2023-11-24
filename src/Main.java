import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cargoWeights = {150, 250, 313}; //weights of cargo

        int attempts = 1;
        boolean isNumberSame = false;
        boolean isAllIncorrect = true;
        int rightGuess = 0;


        while(isAllIncorrect){
            System.out.println("Attemps: " + attempts + " \nEnter the kilometer marks to check cargo location: ");
            int[] numbers = guessNumbers();
            int[] cargoLocations = {2, 3, 4}; //locations of cargo

            //This loop for check your guesses with the real locations of cargo.
            for(int i = 0; i < cargoLocations.length; i++) {
                for(int j = 0; j < numbers.length; j++){
                    if(cargoLocations[i] != numbers[j]){
                        continue;
                    }
                    else{
                        isNumberSame = true;
                        cargoLocations[i] = 0;
                        rightGuess++;
                    }
                }

            }
            if(isNumberSame && rightGuess == 3){
                System.out.println("You guessed " + rightGuess + " kilometer marks. \nYou have found the cargo.");
                break;
            }
            else{
                System.out.println("You guessed " + rightGuess + " kilometers marks");
                rightGuess =  0;

            }

            if(attempts == 5) {
                System.out.println("Your attempts exhausted. Boxes changing locations... ");
                changeLocations(cargoLocations);
                System.out.println("Cargo have changed location. Try again!");
                attempts = 0;
            }
            attempts++;

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
    public static void changeLocations(int[] cargoLocations){
        Random random = new Random();
        for(int i = 0; i < cargoLocations.length; i++) {
           cargoLocations[i] = random.nextInt(6)  + 1;
        }
    }
}