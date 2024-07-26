package longestbinarystring;

public class LongestBinaryString {
    public int findStartIndexOfLongestZeroOrOne(Integer input, char binaryDigit) {
        int maxIndex = -1;

        if(!isValidateInput(input,binaryDigit))
            return maxIndex;

        String binaryString = convertDecimalToBinary(input);
        int binaryStringLength = binaryString.length();
        int runningIndex = 0;
        int maxCount = 0; //count of current max
        int currentStartIndex = 0; //This would be the start anchor in scan.


        while (currentStartIndex < binaryStringLength) {
            currentStartIndex = runningIndex;

            //This is to position the startIndex to the next occurrence of binaryDigit and skip non-matching digit.
            currentStartIndex = getNextStartIndex(binaryDigit, currentStartIndex, binaryStringLength, binaryString);

            runningIndex = currentStartIndex;
            int currentCount = 0;
            //This construct counts the matching digits.
            while ((runningIndex < binaryStringLength) && (binaryString.charAt(runningIndex) == binaryDigit)) {
                ++currentCount;
                ++runningIndex;
            }

            if (currentCount > maxCount) {
                maxIndex = currentStartIndex;
                maxCount = currentCount;
            }
        }

        //Edge case for no matches found (No matching digits).
        if (maxIndex != -1) return maxIndex + 1;
        return maxIndex;
    }

    private boolean isValidateInput(Integer input, char binaryDigit) {
        if(input < 0) return false;
        return binaryDigit == '1' || binaryDigit == '0';
    }

    private static int getNextStartIndex(char binaryDigit, int currentStartIndex, int binaryStringLength, String binaryString) {
        while ((currentStartIndex < binaryStringLength) && (binaryString.charAt(currentStartIndex) != binaryDigit))
            ++currentStartIndex;
        return currentStartIndex;
    }

    private String convertDecimalToBinary(Integer input) {
        if (input == 0)  return "0";

        StringBuilder binaryBuffer = new StringBuilder();
        while(input != 0) {
            binaryBuffer.append(input % 2);
            input = input / 2;
        }
        return binaryBuffer.reverse().toString();
    }

}
