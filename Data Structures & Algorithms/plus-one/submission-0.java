
class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // If digit is less than 9, simply increment it
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0
            digits[i] = 0;
        }

        // If all digits are 9, create a new array
        int[] result = new int[n + 1];

        result[0] = 1;

        return result;
    }
}
