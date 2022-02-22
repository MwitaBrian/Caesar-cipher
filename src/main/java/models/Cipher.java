package models;

public class Cipher {
    int shift = 7;
    String userInput = "I love playing video games!";
    String cipherText = "";

    public String encrypt(String userInput){


        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char ch = userInput.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char newCh = (char) ('a' + (ch - 'a' + shift) % 26);
                    cipherText += newCh;
                }
                else if (Character.isUpperCase(ch)){
                    char newCh =(char) ('A' + (ch - 'A' + shift) % 26);
                    cipherText += newCh;
                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public String decrypt() {
        return cipherText;
    }
}
