import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] locations = {2, 3, 4};
        int[] weights = {150, 250, 313};

        int attemps = 0;

        while(attemps < 5){
            System.out.println("Enter numbers ");
            int[] numbers = guessNumbers();

            for (int i = 0; i < locations.length; i++) {
                for(int j = 0; j < numbers.length; j++){
                    if(locations[i] != numbers[j]){
                        System.out.println("fsdf");
                    }
                }

            }

        }



    }
    public static int[] guessNumbers(){
        Scanner scanner = new Scanner(System.in);
        int guess1 = scanner.nextInt();
        int guess2 = scanner.nextInt();
        int guess3 = scanner.nextInt();
        return new int[]{guess1, guess2, guess3};

    }

}