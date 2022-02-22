import models.Cipher;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cipher newCipher = new Cipher();

        System.out.println("Welcome to Caesar Cipher.");
        System.out.println("Please enter the text you would like to Encrypt.");

        String userInput = input.nextLine();

        String cipheredText = newCipher.encrypt(userInput);
        System.out.println("Your encrypted text: " + cipheredText);

        System.out.println("Type 'decipher' in order to revert your text back to original...");
        String decipher = input.nextLine();

        if (decipher.equals("decipher")){
            String decipheredText = newCipher.decrypt(cipheredText);
            System.out.println("Your deciphered text: " + decipheredText);
        }
        else {
            System.out.println("Wrong Input! Try again!");
        }


    }
}
