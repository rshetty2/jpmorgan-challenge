package maximumoccurence;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


/**
 * Data store class to hold key metrics of each word
 */
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter

public class WordRecord {
    String text;
    int sequence;
    int length;
    int letterCount;
}
