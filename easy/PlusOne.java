package easy;
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int r = digits.length - 1;
        int carry = 1;
        while ( r >= 0 && carry == 1 ){
           digits[r] = digits[r] + 1;
           if ( digits[r] == 10 ){
               digits[r] = 0;
           } else {
               carry = 0;
           }
           r--;
        }
        if ( carry == 1 ){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, newDigits.length - 1);
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        for ( int digit : plusOne(digits) ){
            System.out.print(digit + " ");
        }
    }
}
