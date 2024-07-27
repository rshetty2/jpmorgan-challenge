# jpmorgan-challenge
Code for JP Morgan Code Test

## How to Run
  *  Open the project in IDE
  *  Navigate to project folder src/test/java
  *  MaximumOccurrenceWordTest contains unit tests for Maximum letter occurence code challenge.
  *  LongestBinaryStringTest contains unit tests for the longest Binary string code challenge.

## Dependencies
  * Java 11
  * AssertJ and JUnit for Unit tests
  * Lombok for data wrappers
  * Apache commons for utility classes

## Code Structure
  * Maven for build automation and code management
  * The two code challenges are segregated in different top level packages under main/java folder.
  * Unit tests for two challenges are also maintained in test/java folder in different classes.

## Assumptions
1. Maximum Occurrence code challenge

2. Decimal to Binary code challenge
   * Only 0 or Positive decimal input is allowed. If a negative number is supplied, program will return a negative position indicating invalid number.

## Notes
1. Maximum Occurrence code
   * A wrapper class WordRecord is created only when a word has the search letter in it. This would prevent n number of Wapper objects being created. Worst case space complexity would
     be O(n) due to the usage of a SortedSet object. Worst case time complexity would also be O(n) to iterate through the words while checking for letter presence. Retrieval of matched
     word will be O(1) time complexity.
   * Having a data wrapper also helps to have Separation of logic and cleaner code, as comparision operation is delegated to a comparator. Having a comparator would help to better
     maintain the code if new conditions need to be added.
     
2. Decimal to Binary code
   * Two pointers pattern is used to scan through the binary string. This would ensure that no recursive loops are required. One index currentStartIndex is used to anchor the
     starting of the search range, and the other index runningIndex runs through the search range to perform the count. At no point, the program revisits a paticular index/item in the
     string. Space complexity is O(logn) due to the usage of a StringBuilder object which would do the internal optimization to concatenate individual remainders to form the binary
     string. Time complexity would be O(n) as we need to scan through each element only once.
   * The convertDecimalToBinary method used in the LongestBinaryString class does the binary conversion. We could also use the inbuild toBinaryString method of Integer class to further
     optimize.
