import java.util.Stack;

public class PracticeString {

    public static int noOfVowels(String input) {
        String vowels = "aeiou";
        String stdInput = input.toLowerCase().trim();
        int vowelCount = 0;
        for (char letter: stdInput.toCharArray()) {
            if (vowels.contains(Character.toString(letter))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int noOfConsonants(String input) {
        String vowels = "aeiou";
        String stdInput = input.toLowerCase().trim();
        int consonantCount = 0;
        for (char letter: stdInput.toCharArray()) {
            if (!vowels.contains(Character.toString(letter)) && !Character.toString(letter).equals(" ") ) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static String reverseStringWithStack(String input) {
        StringBuffer buffer =  new StringBuffer();
        Stack<Character> stack  = new Stack<>();

        for (char i: input.toCharArray()) {
            stack.push(i);
        }

        while (!stack.empty()) {
            buffer.append(stack.pop());
        }

        return buffer.toString();
    }

    public static String reverseString(String input) {
        StringBuffer buffer =  new StringBuffer();
        for(int i=input.length() - 1;  i >= 0; i--) {
            buffer.append(input.charAt(i));
        }
        return buffer.toString();
    }

}
