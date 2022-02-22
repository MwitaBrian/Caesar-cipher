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
        System.out.println(cipheredText);

        String decipheredText = newCipher.decrypt(cipheredText);
        System.out.println(decipheredText);
    }
}
