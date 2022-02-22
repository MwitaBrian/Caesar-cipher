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
                if (Character.isLowerCase(ch)){
                    char newCh = (char) (ch + shift);
                    if (newCh > 'z'){
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else {
                        cipherText += newCh;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char newCh = (char) (ch + shift);
                    if (newCh > 'Z'){
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else {
                        cipherText += newCh;
                    }
                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public String decrypt() {
        String newUsertext = "";
        return newUsertext;
    }
}
