package wordle;
import java.util.Random;
import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
        
        // Vælger random ord fra en liste
        String[] words = {
            "Volvo",
            "Bolvo",
            "Smear"
        };

        Random r = new Random();
        String chosenWord = words[r.nextInt(words.length)];


        System.out.println(chosenWord);

        while (true) {
            System.out.println("Guess the word!");
            Scanner s = new Scanner(System.in);
            String guess = s.nextLine();

            for (int i = 0; i < guess.length(); i++){
                char currentGuessLetter = guess.charAt(i);
                char currentChosenWordLetter = chosenWord.charAt(i);

                if (currentGuessLetter == currentChosenWordLetter){
                    System.out.println(currentGuessLetter + " <- Correct Letter, Correct Place");
                    continue;
                }
                // Jeg kan ikke bruge '.contains()' da jeg har gemt det som en char.
                if (chosenWord.indexOf(currentGuessLetter) != -1) {
                    System.out.println(currentGuessLetter + " <- Correct Letter, Wrong Place");
                    continue;
                }
                else {
                    System.out.println(currentGuessLetter + " <- Wrong letter");
                }
            }
            if (guess.equals(chosenWord)){
                System.out.println("Correct! Thanks for playing!");
                break;
            }
            else {
                System.out.println("Ouch! Wrong guess, try again!");
            }
        } 
    }
}
