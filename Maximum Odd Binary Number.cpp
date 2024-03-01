class Solution {
public:
    string maximumOddBinaryNumber(string& s) {
        int left = 0, right = s.size() - 1;

        while (left <= right) {
            if (s[left] == '1') {
                left += 1;
            }

            if (s[right] == '0') {
                right -= 1;
            }

            if (left < right && s[left] == '0' && s[right] == '1') {
                s[left] = '1';
                s[right] = '0';
            }
        }

        s[left - 1] = '0';
        s[s.size() - 1] = '1';

        return s;
    }
};
