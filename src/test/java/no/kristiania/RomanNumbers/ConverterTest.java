package no.kristiania.RomanNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    @Test
    void shouldReturnIfor1(){
        assertEquals("I", toRoman(1));
    }
 @Test
    void shouldReturnIIfor2(){
        assertEquals("II", toRoman(2));
    }
@Test
    void shouldReturnIIIfor3(){
        assertEquals("III", toRoman(3));
    }
@Test
    void shouldReturnIVfor4(){
        assertEquals("IV", toRoman(4));
    }
@Test
    void shouldReturnVfor4(){
        assertEquals("V", toRoman(5));
    }

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        if (number == 5){
            result.append("V");
            number = 0;
        }
        if (number == 4){
            result.append("IV");
            number = 0;
        }

        for (int i = 0; i < number; i++){
            result.append("I");
        }

        return result.toString();
    }



}
