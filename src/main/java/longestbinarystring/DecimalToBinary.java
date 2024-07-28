package longestbinarystring;

public class DecimalToBinary {
    public static String convertDecimalToBinary(int input) throws IllegalArgumentException{
        if (input <0) throw new IllegalArgumentException("Input cannot be a negative number");

        if (input == 0)  return "0";

        StringBuilder binaryBuffer = new StringBuilder();
        while(input > 0) {
            binaryBuffer.append(input % 2);
            input = input / 2;
        }
        return binaryBuffer.reverse().toString();
    }
}
