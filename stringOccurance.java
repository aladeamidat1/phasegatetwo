  public class stringOccurance{

public static int countOccurrance(String input, char letter) {
        int count = 0;
        for (int word = 0; word < input.length(); word++) {
            if (input.charAt(word) == letter) {
                count++;
            }
        }
        return count;
    }

}