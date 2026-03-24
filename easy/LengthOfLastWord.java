package easy;

//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
public class LengthOfLastWord {

//    public int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        return arr[arr.length - 1].length();
//    }

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int count = 0;
        while(end >=0 && s.charAt(end) == ' ') {
            end--;
        }
        while (end >=0 && s.charAt(end) != ' ') {
            count++;
            end--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( new LengthOfLastWord().lengthOfLastWord("Hello World       "));
    }
}
