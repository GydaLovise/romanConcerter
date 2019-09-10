package no.kristiania.RomanNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    //Methods for converting numbers to Roman numerals
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
        void shouldReturnVfor5(){
            assertEquals("V", toRoman(5));
        }
    @Test
    void shouldReturnIXfor9(){
        assertEquals("IX", toRoman(9));
    }
    @Test
    void shouldReturnXfor10(){
        assertEquals("X", toRoman(10));
    }

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", toRoman(37));
    }

    @Test
    void shouldCalculateNumbersOver10(){
        assertEquals("X", toRoman(10));
        assertEquals("XVIII", toRoman(18));

    }

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        //These objects are assigning arguments to the parameters in the number constructor
        number = toRomanDigit(number, result, 10, "X");
        number = toRomanDigit(number, result, 9, "IX");
        number = toRomanDigit(number, result, 5, "V");
        number = toRomanDigit(number, result, 4, "IV");

        //For loop for the numbers 1-3
        for (int j = 0; j < number; j++){
            result.append("I");
        }
        return result.toString();
    }
    //Refactoring.
    private int toRomanDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        while (number >= digitValue){
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }


}


