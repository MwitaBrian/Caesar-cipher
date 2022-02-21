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
    public void encrypt_returnEmptyCipherString_String(){
        Cipher newCipher = new Cipher();
        int shift = 7;
        String cipherText = "";
        assertEquals(cipherText, newCipher.encrypt());
    }

}