package maximumoccurence;

import java.util.*;

import org.apache.commons.lang3.StringUtils;


public class MaximumOccurrenceWord {
    SortedSet<WordRecord> sortedSet = new TreeSet<>(Comparator.comparing(WordRecord::getLetterCount).thenComparing(WordRecord::getLength).thenComparing(WordRecord::getSequence));

    public Optional<String> findWordWithMaximumLetterOccurrence(String sentence, char letter) {
        if (sentence == null)
            return Optional.empty();

        int sequence = 1;
        String[] words = StringUtils.split(sentence);
        for (String word : words) {
            int letterCount = StringUtils.countMatches(word, letter);
            if (letterCount > 0) {
                sortedSet.add(WordRecord.builder().text(word).sequence(sequence--).length(word.length()).letterCount(letterCount).build());
            }
        }

        if(!sortedSet.isEmpty())
            return Optional.of(sortedSet.last().getText());

        return Optional.empty();
    }
}

