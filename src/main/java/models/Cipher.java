package models;

public class Cipher {
    int shift = 7;
    String userInput = "I love playing video games!";

    public String encrypt(String userInput){
        String cipherText = "";

        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char ch = userInput.charAt(i);
            if (Character.isLetter(ch)){

            }
            else {

            }
        }
        return cipherText;
    }
}
