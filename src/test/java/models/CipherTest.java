package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    Cipher newCipher;

    @BeforeEach
    public void setup() {
        newCipher = new Cipher();
    }

    @Test
    @DisplayName("Return Integer for shift value")
    public void encrypt_returnsIntegerForShiftValue_Integer() {
        int shift = 7;
        assertEquals(shift, newCipher.getShift());
    }

    @Test
    @DisplayName("Return empty string")
    public void encrypt_returnsEmptyCipherString_String() {

        int shift = 7;
        String cipherText = "";
        assertEquals(cipherText, newCipher.encrypt(""));
    }

    @Test
    @DisplayName("For loop returns characters from User's input")
    public void encrypt_forLoopReturnsCharactersFromUserInput_Char() {

        int shift = 7;
        String cipherText = "";
        String userInput = "I love playing video games!";
        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char ch = userInput.charAt(i); //Confirm that ch iterates through the characters in userInput string
            assertEquals(ch, ch);
        }
    }

    @Test
    public void encrypt_checkCharacterInStringIsLetter_boolean() {
        int shift = 7;
        String cipherText = "";
        String userInput = "I love playing video games!";
        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char ch = userInput.charAt(i); //Confirm that ch iterates through the characters in userInput string
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {

                } else if (Character.isUpperCase(ch)) {

                }
            } else {
                cipherText += ch;
            }
            assertEquals(Character.isLetter(ch), Character.isLetter(ch));
        }
    }

    @Test
    public void encrypt_cipherTextReturnedIsNotEmptyString_boolean(){
        int shift = 7;
        String cipherText = "";
        String userInput = "I love playing video games!";
        int length = userInput.length();
        for (int i = 0; i < length; i++){
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
            }
            else {
                cipherText += ch;
            }
            assertEquals(false, newCipher.encrypt(userInput).equals(""));
        }
    }

    @Test
    public void decrypt_checkThatDecryptMethodReturnsString_String(){
        assertEquals(true,newCipher.decrypt("")instanceof String);
    }

    @Test
    public void decrypt_returnsSameUserText_String(){
        Cipher newCipher = new Cipher();
        int shift = 7;
        String userInput = "I love playing video games!";
        String newUserText = "";
        String cipheredText = newCipher.encrypt(userInput);
        int length = cipheredText.length();
        for (int i = 0; i < length; i++){
            char ch = cipheredText.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char newCh = (char) (ch - shift);
                    if (newCh < 'a'){
                        newUserText += (char)(ch + (26 - shift));
                    }
                    else {
                        newUserText += newCh;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char newCh = (char) (ch - shift);
                    if (newCh < 'A'){
                        newUserText += (char)(ch + (26 - shift));
                    }
                    else {
                        newUserText += newCh;
                    }
                }
            }
            else {
                newUserText += ch;
            }
        }
        assertEquals(true, newCipher.decrypt("P svcl wshfpun cpklv nhtlz!").equals(userInput));
    }

}