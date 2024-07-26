package maximumoccurence;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

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
