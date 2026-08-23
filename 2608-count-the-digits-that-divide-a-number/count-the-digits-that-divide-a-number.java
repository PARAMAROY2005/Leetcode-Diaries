class Solution {
    public int countDigits(int num) {
        int digit, original, count = 0;

        original = num;

        while (num > 0) {
            digit = num % 10;

            if (digit != 0 && original % digit == 0)
                count++;

            num = num / 10;
        }

        return count;
    }
}