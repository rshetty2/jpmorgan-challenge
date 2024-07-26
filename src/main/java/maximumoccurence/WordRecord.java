package maximumoccurence;

import lombok.*;


/**
 * Data store class to hold key metrics of each word
 */
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Builder

public class WordRecord {
    String text;
    int sequence;
    int length;
    int letterCount;
}
