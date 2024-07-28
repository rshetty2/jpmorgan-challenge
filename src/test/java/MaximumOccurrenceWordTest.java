import maximumoccurence.MaximumOccurrenceWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void givenAString_whenTwoWordHaveMaxOccurrence_thenReturnTheLongerWord() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy crrrazy crrazy world";
        char searchLetter = 'z';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        assert(matchWord).equals("crrrazy");
    }

    @Test
    public void givenAString_whenDifferentLetterCase_thenReturnMatchingCase() {
        String inputString = "This is a very long sentence and i want to educate everyone in this whole crazy world that I exist";
        char searchLetter = 'I';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        assert(matchWord).equals("I");
    }

    @Test
    public void givenAString_whenTwoWordHaveMaxOccurrenceAndSameLength_thenReturnTheFirstOccurrence() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char searchLetter = 'e';
        String matchWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        assert(matchWord).equals("sentence");
    }

    @Test
    public void givenAStringWithWhitespaceEscapeChars_whenSearched_thenReturnSuccessByIgnoringWhiteSpaces() {
        String inputString = "This is a very long \t\tsentence and I want to educate \t\teveryone\t\t in this whole crazy world";
        char searchLetter = 'e';
        String matchedWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter).get();
        assert(matchedWord).equals("sentence");
    }

    @Test
    public void givenAString_whenNoWordHasContainsSearchLetter_thenReturnEmpty() {
        String inputString = "This is a very long sentence and I want to educate everyone in this whole crazy world";
        char searchLetter = 'x';
        Optional<String> matchedWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter);
        assertTrue(matchedWord.isEmpty());
    }

    @Test
    public void givenAString_whenStringIsBlank_thenReturnEmpty() {
        String inputString = "     ";
        char searchLetter = 'x';
        Optional<String> matchedWord = maximumOccurrenceWord.findWordWithMaximumLetterOccurrence(inputString,searchLetter);
        assertTrue(matchedWord.isEmpty());
    }
}
