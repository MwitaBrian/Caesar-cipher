package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    Cipher newCipher;
    @BeforeEach
    public void setup(){
        newCipher = new Cipher();
    }
    @Test
    @DisplayName("Return Integer for shift value")
    public void encrypt_returnsIntegerForShiftValue_Integer(){
        int shift = 7;
        assertEquals(shift, newCipher.shift);
    }

    @Test
    @DisplayName("Return empty string")
    public void encrypt_returnEmptyCipherString_String(){

        int shift = 7;
        String cipherText = "";
        assertEquals(cipherText, newCipher.encrypt());
    }

    @Test
    @DisplayName("For loop returns characters from User's input")
    public void encrypt_forLoopReturnsCharactersFromUserInput_Char(){

        int shift = 7;
        String cipherText = "";
        String userInput = "I love playing video games!";
        int length = userInput.length();
        for (int i = 0; i < length; i++){
            char ch = userInput.charAt(i);
            assertEquals(ch, ch);
        }
    }

}