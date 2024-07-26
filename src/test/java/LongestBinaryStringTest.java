
import longestbinarystring.LongestBinaryString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Assertions to check start of longest string with 1s in a binary number")
public class LongestBinaryStringTest {

    LongestBinaryString longestBinaryString;

    @BeforeEach
    public void Setup() {
        longestBinaryString = new LongestBinaryString();
    }

    @Test
    public void givenPositiveNumber156SearchBinary1_whenConvertedToBinary_thenSuccessReturn4() {
        int inputDecimalNumber = 156;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'1');
        assert(Integer.valueOf(startIndex)).equals(4);
    }


    @Test
    public void givenPositiveNumber88SearchBinary1_whenConvertedToBinary_thenSuccessReturn3() {
        int inputDecimalNumber = 88;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'1');
        assert(Integer.valueOf(startIndex)).equals(3);
    }

    @Test
    public void givenPositiveNumber156SearchBinary0_whenConvertedToBinary_thenSuccessReturn2() {
        int inputDecimalNumber = 156;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'0');
        assert(Integer.valueOf(startIndex)).equals(2);
    }

    @Test
    public void givenPositiveNumber0SearchBinary0_whenConvertedToBinary_thenSuccessReturn1() {
        int inputDecimalNumber = 0;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'0');
        assert(Integer.valueOf(startIndex)).equals(1);
    }


    //Negative cases
    @Test
    public void givenPositiveNumber0SearchBinary1_whenConvertedToBinary_thenFailReturnNegativeIndex() {
        int inputDecimalNumber = 0;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'1');
        assertThat(Integer.valueOf(startIndex)).isLessThan(0);
    }

    @Test
    public void givenNegativeNumber_whenValidatedAndError_thenFailReturnNegativeIndex() {
        int inputDecimalNumber = -10;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'1');
        assertThat(Integer.valueOf(startIndex)).isLessThan(0);
    }

    @Test
    public void givenPositiveNumberAndInvalidBinaryDigit_whenValidatedAndError_thenFailReturnNegativeIndex() {
        int inputDecimalNumber = -10;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,'2');
        assertThat(Integer.valueOf(startIndex)).isLessThan(0);
    }

}