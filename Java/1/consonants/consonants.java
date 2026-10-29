import java.util.Scanner;

public class consonants {
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {

        String word = s.nextLine();

        String firstLetter = word.substring(0, 1).toUpperCase();
        if (!"AEIOUÆØÅ".contains(firstLetter)){
            System.out.println("Det er en konsonant");
        }
        else {
            System.out.println("Det er en vokal");
        }
    }
}
