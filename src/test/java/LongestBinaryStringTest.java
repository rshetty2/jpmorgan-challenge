
import longestbinarystring.LongestBinaryString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("Assertions to check start of longest string with 1s in a binary number")
public class LongestBinaryStringTest {

    LongestBinaryString longestBinaryString;

    @BeforeEach
    public void Setup() {
        longestBinaryString = new LongestBinaryString();
    }

    @Test
    public void givenANumber_whenConvertedToBinary_thenReturnStartPositionOfMax1Length() {
        int inputDecimalNumber = 156;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,1);
        assert(Integer.valueOf(startIndex)).equals(4);
    }

    @Test
    public void givenANumber_whenConvertedToBinary_thenReturnStartPositionOfMax0Length() {
        int inputDecimalNumber = 156;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,0);
        assert(Integer.valueOf(startIndex)).equals(2);
    }

    @Test
    public void givenANumber_whenConvertedToBinaryAndNo1Found_thenReturnNegativeNumber() {
        int inputDecimalNumber = 0;
        int startIndex = longestBinaryString.findStartIndexOfLongestZeroOrOne(inputDecimalNumber,1);
        assertThat(Integer.valueOf(startIndex)).isLessThan(0);
    }


}