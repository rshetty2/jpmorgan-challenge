import maximumoccurence.MaximumOccurrenceWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Assertions to check maximum occurrence of characters")
public class MaximumOccurrenceWordTest {

    MaximumOccurrenceWord maximumOccurrenceWord;

    @BeforeEach
    public void Setup() {
        maximumOccurrenceWord = new MaximumOccurrenceWord();
    }

    @Test
    public void givenAString_whenOneWordHasMaxOccurrence_thenReturnTheWord() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char searchLetter = 'z';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        assert(matchWord).equals("crazy");
    }

    @Test
    public void givenAString_whenTwoWordHasMaxOccurrence_thenReturnTheLongerWord() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy crrrazy crrazy world";
        char searchLetter = 'z';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        System.out.println(matchWord);
        assert(matchWord).equals("crrrazy");
    }

    @Test
    public void givenAString_whenTwoWordHasMaxOccurrenceAndSameLength_thenReturnTheFirstOccurrence() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char searchLetter = 'e';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        System.out.println(matchWord);
        assert(matchWord).equals("sentence");
    }
}
