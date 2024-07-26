# jpmorgan-challenge
Code for JP Morgan Code Test

## How to Run
  *  Open the project in IDE
  *  Navigate to project folder src/test/java
  *  MaximumOccurrenceWordTest contains unit tests for First code challenge
  *  TODO

## Dependencies
  * Java 15
  * AssertJ and JUnit for Unit tests
  * Lombok for data wrappers
  * Apache commons for utility classes

## Code Structure
  * Maven for build automation and code management
  * The two code challenges are segregated in different top level packages under main/java folder.
  * Unit tests for two challenges are also maintained in test/java folder in different classes.

## Notes
1. Maximum Occurrence code
   * A wrapper class WordRecord is created only when a word has the search letter in it. This would prevent n number of Wapper objects being created. Worst case space complexity would be n due to the   
     usage of a SortedSet object. Worst case time complexity would also be O(n) to iterate through the words while checking for letter presence. Retrieval of matched word will be O(1) time complexity.
   * Having a data wrapper also helps to have Separation of logic and cleaner code, as comparision operation is delegated to a comparator. Having a comparator would help to better maintain the code
     if new conditions need to be added.
     
2. Decimal to Binary code

