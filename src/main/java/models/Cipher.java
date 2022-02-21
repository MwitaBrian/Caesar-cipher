package models;

public class Cipher {
    int shift = 7;

    public String encrypt(){
        String cipherText = "";
        String userInput = "I love playing video game!";
        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char ch = userInput.charAt(i);
        }
        return cipherText;
    }
}
